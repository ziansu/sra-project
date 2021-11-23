@java.lang.Override
public ba.aljovic.amer.application.database.entities.userratingsjob.ImdbUser read() {
    try {
        if (((userCount) < (userIds.size())) && (!(userIds.isEmpty()))) {
            return repository.findOne(userIds.get(userCount));
        }
        return null;
    } finally {
        (userCount)++;
    }
}