@java.lang.Override
public codeu.chat.common.Interests newInterest(codeu.chat.util.Uuid userid, codeu.chat.util.Uuid interest, codeu.chat.util.Time creationTime) {
    final codeu.chat.common.User foundUser = model.userById().first(userid);
    if (foundUser != null) {
        model.add(userid, interest, creationTime);
        codeu.chat.server.Controller.LOG.info(((("Interest with id " + interest) + " added to user ") + userid));
    }
    return model.interestsByUserId().first(userid);
}