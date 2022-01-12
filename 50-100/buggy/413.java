private void updateSummaries() {
    int yellowValue = java.lang.Integer.valueOf(yellowAlert.getText());
    yellowAlert.setSummary(context.getResources().getQuantityString(R.plurals.plural_day, yellowValue, yellowValue));
    int redValue = java.lang.Integer.valueOf(redAlert.getText());
    redAlert.setSummary(context.getResources().getQuantityString(R.plurals.plural_day, redValue, redValue));
}