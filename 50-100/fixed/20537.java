private void createAnimalInProtocol(java.lang.String protocolInstanceId, java.lang.String animalId) {
    java.lang.String newId = "TEMP_" + (java.util.Calendar.getInstance().getTimeInMillis());
    long currentDate = java.util.Calendar.getInstance().getTimeInMillis();
    java.lang.String query = "INSERT INTO animal_in_protocol(id, protocol_instance_id, animal_id, modified_on, by_user_id) VALUES('%s','%s',%s,%d,%s)";
    query = java.lang.String.format(query, newId, protocolInstanceId, animalId, currentDate, userId);
    com.vetoquinol.vetosynch.DBManager.executeQuery(query);
}