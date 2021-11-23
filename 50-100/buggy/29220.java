@java.lang.Override
protected void onPostExecute(java.lang.String[] weatherData) {
    mDataProgessBar.setVisibility(View.INVISIBLE);
    if (weatherData != null) {
        showWeatherDataView();
        for (java.lang.String weatherString : weatherData) {
            mWeatherTextView.append((weatherString + "\n\n\n"));
        }
    }
    showErrorMessage();
}