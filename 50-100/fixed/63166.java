public static boolean deleteServer(pt.ulisboa.tecnico.amorphous.requestrouter.internal.RequestRouterCluster cluster, pt.ulisboa.tecnico.amorphous.requestrouter.internal.AmorphousServer server) {
    java.util.List<java.lang.String> result = pt.ulisboa.tecnico.amorphous.requestrouter.lvs.LVSImplementation.executeCommand(pt.ulisboa.tecnico.amorphous.requestrouter.lvs.LVSImplementation.prepareCmd(pt.ulisboa.tecnico.amorphous.requestrouter.lvs.LVSImplementation.CMD_REMOVE_SERVER, cluster, server));
    if ((result == null) || (result.isEmpty()))
        return false;
    else
        return true;
    
}