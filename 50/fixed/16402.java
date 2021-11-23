public void enableTransformEditing(boolean choice) {
    txtRuleName.setEnabled(choice);
    txtRuleRegex.setEnabled(choice);
    tblTransforms.setEnabled(choice);
    btnAddTransform.setEnabled(choice);
    btnDeleteTransform.setEnabled(choice);
}