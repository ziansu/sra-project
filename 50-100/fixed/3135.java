@java.lang.Override
public void receive(com.liferay.portal.kernel.messaging.Message message) throws com.liferay.portal.kernel.messaging.MessageListenerException {
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