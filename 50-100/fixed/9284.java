private void leaveApplicationStatusChange(final org.egov.eis.model.LeaveApplication leaveApplication) {
    final java.lang.String workFlowAction = leaveApplication.getWorkflowDetails().getAction();
    if ("Approve".equalsIgnoreCase(workFlowAction))
        leaveApplication.setStatus(LeaveStatus.APPROVED);
    else
        if ("Reject".equalsIgnoreCase(workFlowAction))
            leaveApplication.setStatus(LeaveStatus.REJECTED);
        else
            if ("Cancel".equalsIgnoreCase(workFlowAction))
                leaveApplication.setStatus(LeaveStatus.CANCELLED);
            else
                if ("Submit".equalsIgnoreCase(workFlowAction))
                    leaveApplication.setStatus(LeaveStatus.RESUBMITTED);
                
            
        
    
}