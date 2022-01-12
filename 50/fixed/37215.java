@java.lang.Override
protected void onPostExecute(java.lang.String[] weatherData) {
    if (weatherData != null) {
        mAdapter.setData(weatherData, getApplicationContext());
    }else {
        mAdapter.setData(null, getApplicationContext());
    }
}