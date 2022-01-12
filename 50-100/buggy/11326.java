private void fetch() throws com.hummingwave.Custom.WaveORMException {
    com.sample.Employee employee = new com.sample.Employee();
    java.util.List object = employee.fetchRecords(null, null, null, null, null, null);
    employee = ((com.sample.Employee) (object.get(0)));
    {
        {
            try {
                android.util.Log.e("RESULT", ((new java.lang.String(employee.getBytes(), "ISO-8859-15")) + ""));
            } catch (java.io.UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
    }
}