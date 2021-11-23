@java.lang.Override
public void receive(com.liferay.portal.kernel.messaging.Message message) throws com.liferay.portal.kernel.messaging.MessageListenerException {
    java.lang.System.out.println("digest-debug: ProposalContestPhaseAutopromoteTask reached");
    synchronized(org.xcolab.services.tasks.ProposalContestPhaseAutopromoteTask.mutex) {
        if (isExecuting) {
            return ;
        }
        isExecuting = true;
    }
    try {
        com.ext.portlet.service.ContestPhaseLocalServiceUtil.autoPromoteProposals();
    } catch (java.lang.Throwable e) {
        _log.error("Error while promoting proposals in contest phases", e);
    }
    synchronized(org.xcolab.services.tasks.ProposalContestPhaseAutopromoteTask.mutex) {
        isExecuting = false;
    }
}