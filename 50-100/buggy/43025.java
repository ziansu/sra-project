@java.lang.Override
public org.worldgrower.OperationInfo calculateGoal(org.worldgrower.WorldObject performer, org.worldgrower.World world) {
    org.worldgrower.attribute.WantedProfession wantedProfession = performer.getProperty(Constants.WANTED_PROFESSION);
    org.worldgrower.WorldObject villageLeader = org.worldgrower.goal.GroupPropertyUtils.getLeaderOfVillagers(world);
    if (org.worldgrower.goal.WantedProfessionGoal.canAskToBecomePublicEmployee(performer, wantedProfession, world)) {
        org.worldgrower.conversation.Conversation conversation = wantedProfession.getConversation();
        return new org.worldgrower.OperationInfo(performer, villageLeader, org.worldgrower.conversation.Conversations.createArgs(conversation), org.worldgrower.actions.Actions.TALK_ACTION);
    }else {
        return null;
    }
}