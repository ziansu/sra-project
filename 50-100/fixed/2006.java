public static boolean deleteCluster(pt.ulisboa.tecnico.amorphous.requestrouter.internal.RequestRouterCluster cluster) {
    java.util.List<java.lang.String> result = pt.ulisboa.tecnico.amorphous.requestrouter.lvs.LVSImplementation.executeCommand(pt.ulisboa.tecnico.amorphous.requestrouter.lvs.LVSImplementation.prepareCmd(pt.ulisboa.tecnico.amorphous.requestrouter.lvs.LVSImplementation.CMD_REMOVE_CLUSTER, cluster));
    if ((result == null) || (result.isEmpty()))
        return false;
    else
        return true;
    
}