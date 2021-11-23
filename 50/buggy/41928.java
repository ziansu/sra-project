@java.lang.Override
protected void onPostExecute(example.normeow.sunshine.DayWeather[] result) {
    if (result != null) {
        adapter.clear();
        adapter.setList(java.util.Arrays.asList(result));
    }
}