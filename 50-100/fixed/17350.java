@java.lang.Override
public void callback(final org.jbpm.console.ng.ht.model.TaskAssignmentSummary response) {
    if (((response == null) || ((response.getPotOwnersString()) == null)) || (response.getPotOwnersString().isEmpty())) {
        view.setPotentialOwnersInfo(constants.No_Potential_Owners());
    }else {
        view.setPotentialOwnersInfo(response.getPotOwnersString().toString());
        view.enableDelegateButton(response.isDelegationAllowed());
        view.enableUserOrGroupInput(response.isDelegationAllowed());
    }
}