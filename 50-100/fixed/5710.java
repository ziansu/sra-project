public boolean setRecord(java.lang.String record) {
    if ((record == null) || ((record.length()) == 0)) {
        java.lang.System.out.println("Incorrect record!");
        return false;
    }
    try {
        BasicDBObject[] seedData = MongoConnection.createSeedData(record);
        rec.insert(seedData);
    } catch (java.net.UnknownHostException e) {
        e.printStackTrace();
        return false;
    }
    return true;
}