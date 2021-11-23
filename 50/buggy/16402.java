public void enableTransformEditing(boolean choice) {
    txtRuleName.setEditable(choice);
    txtRuleRegex.setEditable(choice);
    tblTransforms.setEnabled(choice);
    btnAddTransform.setEnabled(choice);
    btnDeleteTransform.setEnabled(choice);
}