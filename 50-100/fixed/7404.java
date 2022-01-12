@java.lang.Override
public void getAllOperationIssuesByMedicoId(java.util.List<com.artursworld.reactiontest.model.entity.OperationIssue> operationIssuesList) {
    addItemsOnOperationIssueSpinner(operationIssuesList, spinner);
    com.artursworld.reactiontest.controller.util.UtilsRG.info(((("Operation issues loaded for user(" + (getSelectedMedicalUser())) + ")=") + (operationIssuesList.toString())));
    if (spinner != null) {
        com.artursworld.reactiontest.controller.util.UtilsRG.putString(UtilsRG.OPERATION_ISSUE, spinner.getSelectedItem().toString(), getActivity());
    }
}