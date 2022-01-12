public jvn.JvnObject lookupObject(java.lang.String jon, jvn.JvnRemoteServer js) throws jvn.JvnException {
    int i = 0;
    while ((i < (jvn.JvnObjectRegistry.MAXENTRY)) && (!((jon.equals(registry[i].getName())) && ((registry[i].getCurrentOwner()) == js)))) {
        java.lang.System.out.println(i);
        i++;
    } 
    if (i == (jvn.JvnObjectRegistry.MAXENTRY)) {
        return null;
    }
    return registry[i].getObject();
}