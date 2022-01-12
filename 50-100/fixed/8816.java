private void save() throws com.hummingwave.Custom.WaveORMException {
    com.sample.Employee employee = new com.sample.Employee();
    employee.setEmpNo("027");
    employee.setName("Chaitra");
    employee.setBytes("Chaitra".getBytes());
    android.util.Log.d("BYTES", (("Chaitra".getBytes()) + ""));
    employee.update();
}