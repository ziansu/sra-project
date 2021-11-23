private static databaseinterface.Date convertEpochToReadable(int epoch) {
    databaseinterface.Date d = new databaseinterface.Date(((java.lang.Long.parseLong(epoch)) * 1000));
    return d;
}