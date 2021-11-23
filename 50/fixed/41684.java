@java.lang.Override
@org.springframework.transaction.annotation.Transactional(readOnly = true)
public fi.om.initiative.service.VotingInfo getVotingInfo(fi.om.initiative.dto.initiative.InitiativeBase initiative) {
    return getVotingInfo(initiative, userService.getCurrentUser());
}