@java.lang.Override
protected void onPostExecute(com.grp8.weatherapp.Entities.DataReading reading) {
    if (reading != null) {
        updateView(reading);
    }else
        failed = true;
    
    refresh();
}