@java.lang.Override
public boolean isActive(final module.mission.domain.MissionProcess missionProcess, final org.fenixedu.bennu.core.domain.User user) {
    return (((super.isActive(missionProcess, user)) && (!(missionProcess.getIsCanceled()))) && (missionProcess.canRemoveAuthorization(user))) && (!(missionProcess.hasAnyActivePaymentProcess()));
}