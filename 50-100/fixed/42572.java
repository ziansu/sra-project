@controllers.util.FlashException(keep = true, referrer = { "create" , "edit" })
public static void save(controllers.compute.HostClusters.HostClusterForm hostCluster) {
    hostCluster.validate("hostCluster");
    if (play.data.validation.Validation.hasErrors()) {
        controllers.Common.handleError();
    }
    java.lang.String id = hostCluster.save(hostCluster);
    flash.success(util.MessagesUtils.get(controllers.compute.HostClusters.SAVED, hostCluster.name));
    controllers.compute.HostClusters.list();
}