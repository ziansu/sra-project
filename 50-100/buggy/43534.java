public aQute.bnd.osgi.Attrs getByBinaryName(java.lang.String s) {
    if ((map) == null)
        return null;
    
    for (java.util.Map.Entry<aQute.bnd.osgi.Descriptors.PackageRef, aQute.bnd.osgi.Attrs> pr : map.entrySet()) {
        if (pr.getKey().getBinary().equals(s))
            pr.getValue();
        
    }
    return null;
}