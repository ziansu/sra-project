private java.lang.String getBlockName(in.ac.iitp.remoteaccess.model.LogModel data) {
    java.lang.String name = data.getAppName();
    if ((name.lastIndexOf('/')) >= 0)
        name = name.substring(((name.lastIndexOf('/')) + 1));
    
    return name;
}