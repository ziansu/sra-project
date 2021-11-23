private void setResultAndFinish() {
    android.content.Intent resultValue = new android.content.Intent();
    resultValue.putExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, mAppWidgetId);
    setResult(Activity.RESULT_OK, resultValue);
    finish();
}