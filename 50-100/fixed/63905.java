private fi.om.initiative.service.VotingInfo getVotingInfo(fi.om.initiative.dto.initiative.InitiativeBase initiative, fi.om.initiative.service.User user) {
    org.joda.time.DateTime now = new org.joda.time.DateTime();
    if ((initiative.getId()) == null) {
        return new fi.om.initiative.service.VotingInfo();
    }else {
        org.joda.time.DateTime votingTime = null;
        if (user.isAuthenticated()) {
            votingTime = getVotingTime(initiative.getId());
        }
        return new fi.om.initiative.service.VotingInfo(initiative, user, now, votingTime, initiativeSettings.getMinSupportCountForSearch(), initiativeSettings.getRequiredMinSupportCountDuration());
    }
}