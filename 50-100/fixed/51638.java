public java.util.List<dk.statsbiblioteket.doms.updatetracker.webservice.PidDatePidPid> listObjectsChangedSince(@javax.jws.WebParam(name = "collectionPid", targetNamespace = "")
java.lang.String collectionPid, @javax.jws.WebParam(name = "viewAngle", targetNamespace = "")
java.lang.String viewAngle, @javax.jws.WebParam(name = "beginTime", targetNamespace = "")
long beginTime, @javax.jws.WebParam(name = "state", targetNamespace = "")
java.lang.String state, @javax.jws.WebParam(name = "offset", targetNamespace = "")
java.lang.Integer offset, @javax.jws.WebParam(name = "limit", targetNamespace = "")
java.lang.Integer limit) throws dk.statsbiblioteket.doms.updatetracker.webservice.InvalidCredentialsException, dk.statsbiblioteket.doms.updatetracker.webservice.MethodFailedException {
    java.util.List<dk.statsbiblioteket.doms.updatetracker.improved.database.Entry> entries = dk.statsbiblioteket.doms.updatetracker.improved.Meat.getStore().lookup(new java.util.Date(beginTime), viewAngle, offset, limit, state, false);
    return convert(entries);
}