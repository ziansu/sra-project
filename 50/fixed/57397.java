public void closeGroupChannel(models.StudyResult studyResult, models.GroupModel group) throws publix.exceptions.InternalServerErrorPublixException {
    if (group == null) {
        return ;
    }
    sendMsg(studyResult, group, new publix.groupservices.akka.messages.GroupDispatcherProtocol.PoisonChannel(studyResult.getId()));
}