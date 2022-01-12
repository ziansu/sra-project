private void fetch() throws com.hummingwave.Custom.WaveORMException {
    com.sample.Employee employee = new com.sample.Employee();
    java.util.List object = employee.fetchRecords(null, null, null, null, null, null);
    android.util.Log.e("RESULT", (((com.sample.Employee) (object.get(0))) + ""));
}