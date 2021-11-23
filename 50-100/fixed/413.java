private void updateSummaries() {
    int yellowValue = java.lang.Integer.valueOf(yellowAlert.getText());
    yellowAlert.setSummary(context.getResources().getQuantityString(R.plurals.plural_day, java.lang.Math.abs(yellowValue), yellowValue));
    int redValue = java.lang.Integer.valueOf(redAlert.getText());
    redAlert.setSummary(context.getResources().getQuantityString(R.plurals.plural_day, java.lang.Math.abs(redValue), redValue));
}