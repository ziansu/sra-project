public static boolean canAskToBecomePublicEmployee(org.worldgrower.WorldObject performer, org.worldgrower.attribute.WantedProfession wantedProfession, org.worldgrower.World world) {
    org.worldgrower.WorldObject villageLeader = org.worldgrower.goal.GroupPropertyUtils.getLeaderOfVillagers(world);
    if (villageLeader != null) {
        boolean previousAnswerWasNegative = wantedProfession.getConversation().previousAnswerWasNegative(performer, villageLeader, world);
        return (!previousAnswerWasNegative) && (villageLeader != null);
    }else {
        return false;
    }
}