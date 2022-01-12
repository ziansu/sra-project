public void updateFragment() {
    if ((onCreateViewCalled) && (isAdded())) {
        updateParameterItem();
        if ((parameterItem) == null) {
            return ;
        }
        detailTextView.setText(java.lang.String.format("%s %s", getResources().getString(R.string.current_value), parameterItem.readingToString()));
        isValidIndicator.setColorFilter(android.support.v4.content.ContextCompat.getColor(getContext(), (parameterItem.isValid ? R.color.greenA700 : R.color.redA700)));
        AddEntryToChart(parameterItem.getLatestMeasurement());
    }
}