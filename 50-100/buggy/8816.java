private void save() throws com.hummingwave.Custom.WaveORMException {
    com.sample.Employee employee = new com.sample.Employee();
    employee.setEmpNo("027");
    employee.setName("Chaitra");
    {
        try {
            employee.setBytes("Chaitra".getBytes("ISO-8859-15"));
        } catch (java.io.UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
    android.util.Log.d("BYTES", (("Chaitra".getBytes()) + ""));
    employee.update();
}