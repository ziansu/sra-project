@javax.annotation.PostConstruct
public void findUsers() {
    userIds = new java.util.ArrayList<>();
    java.util.List<ba.aljovic.amer.application.database.entities.userratingsjob.ImdbUser> users = repository.findUsersByRange(fromId, toId);
    userIds.addAll(users.stream().map(ImdbUser::getId).collect(java.util.stream.Collectors.toList()));
}