public jvn.JvnObject lookupObject(java.lang.String jon, jvn.JvnRemoteServer js) throws jvn.JvnException {
    int i = 0;
    while ((i < (jvn.JvnObjectRegistry.MAXENTRY)) && (!((registry[i].getName().equals(jon)) && ((registry[i].getCurrentOwner()) == js))))
        i++;
    
    if (i == (jvn.JvnObjectRegistry.MAXENTRY)) {
        return null;
    }
    return registry[i].getObject();
}