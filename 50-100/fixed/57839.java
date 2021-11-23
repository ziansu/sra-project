public java.util.ArrayList<server.Record> getRecordsFromPatient(server.User p) {
    java.util.ArrayList<server.Record> list = new java.util.ArrayList<server.Record>();
    server.Record record;
    for (int i = 0; i < (recordList.size()); i++) {
        record = recordList.get(i);
        if (((record.patient) != null) && (record.patient.equals(p.getName()))) {
            list.add(record);
        }
    }
    return list;
}