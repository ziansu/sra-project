public static boolean addCluster(pt.ulisboa.tecnico.amorphous.requestrouter.internal.types.Cluster cluster) {
    java.util.List<java.lang.String> result = pt.ulisboa.tecnico.amorphous.requestrouter.internal.lvs.LVSImplementation.executeCommand(pt.ulisboa.tecnico.amorphous.requestrouter.internal.lvs.LVSImplementation.prepareCmd(pt.ulisboa.tecnico.amorphous.requestrouter.internal.lvs.LVSImplementation.CMD_ADD_CLUSTER, cluster));
    if ((result == null) || (result.isEmpty()))
        return false;
    else
        return true;
    
}