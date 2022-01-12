public static boolean deleteServer(pt.ulisboa.tecnico.amorphous.requestrouter.internal.types.Cluster cluster, pt.ulisboa.tecnico.amorphous.requestrouter.internal.types.Server server) {
    java.util.List<java.lang.String> result = pt.ulisboa.tecnico.amorphous.requestrouter.internal.lvs.LVSImplementation.executeCommand(pt.ulisboa.tecnico.amorphous.requestrouter.internal.lvs.LVSImplementation.prepareCmd(pt.ulisboa.tecnico.amorphous.requestrouter.internal.lvs.LVSImplementation.CMD_REMOVE_SERVER, cluster, server));
    if ((result == null) || (result.isEmpty()))
        return false;
    else
        return true;
    
}