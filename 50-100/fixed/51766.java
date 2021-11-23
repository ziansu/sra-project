private int getReplicas(it.polimi.modaclouds.space4cloud.optimization.solution.impl.Tier t) {
    it.polimi.modaclouds.space4cloud.optimization.solution.impl.CloudService serv = t.getCloudService();
    if (serv instanceof it.polimi.modaclouds.space4cloud.optimization.solution.impl.IaaS) {
        return ((it.polimi.modaclouds.space4cloud.optimization.solution.impl.IaaS) (t.getCloudService())).getReplicas();
    }else
        if (serv instanceof it.polimi.modaclouds.space4cloud.optimization.solution.impl.PaaS) {
            return ((it.polimi.modaclouds.space4cloud.optimization.solution.impl.PaaS) (t.getCloudService())).getReplicas();
        }
    
    return 0;
}