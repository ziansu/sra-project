private int getReplicas(it.polimi.modaclouds.space4cloud.optimization.solution.impl.Tier t) {
    it.polimi.modaclouds.space4cloud.optimization.solution.impl.CloudService serv = t.getCloudService();
    if (serv instanceof it.polimi.modaclouds.space4cloud.optimization.solution.impl.IaaS) {
        it.polimi.modaclouds.space4cloud.optimization.solution.impl.IaaS res = ((it.polimi.modaclouds.space4cloud.optimization.solution.impl.IaaS) (t.getCloudService()));
        return res.getReplicas();
    }else
        if (serv instanceof it.polimi.modaclouds.space4cloud.optimization.solution.impl.PaaS) {
            return 1;
        }
    
    return 0;
}