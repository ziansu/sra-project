@java.lang.Override
public void onCommandSuccess(final org.sigmah.shared.command.result.ValueResult result) {
    final java.util.Map<java.lang.Integer, java.lang.String> values = org.sigmah.shared.util.ValueResultUtils.splitMapElements(result.getValueObject());
    if (values.containsKey(plannedBudgetField.getId())) {
        plannedBudget = java.lang.Double.valueOf(values.get(plannedBudgetField.getId()));
    }
    if ((linkedProject) != null) {
        view.getAmountField().setValue(linkedProject.getPercentage());
        updatePercentageField();
    }
}