public long getLatestModificationTime(@javax.jws.WebParam(name = "collectionPid", targetNamespace = "")
java.lang.String collectionPid, @javax.jws.WebParam(name = "viewAngle", targetNamespace = "")
java.lang.String viewAngle, @javax.jws.WebParam(name = "state", targetNamespace = "")
java.lang.String state) throws dk.statsbiblioteket.doms.updatetracker.webservice.InvalidCredentialsException, dk.statsbiblioteket.doms.updatetracker.webservice.MethodFailedException {
    java.util.List<dk.statsbiblioteket.doms.updatetracker.improved.database.Entry> entries = dk.statsbiblioteket.doms.updatetracker.improved.Meat.getStore().lookup(new java.util.Date(0), viewAngle, 0, 1, true);
    if ((entries.size()) != 1) {
        return 0;
    }else {
        return entries.get(0).getDateForChange().getTime();
    }
}