@java.lang.Override
public int removePool(java.lang.String poolId) {
    net.floodlightcontroller.loadbalancer.LBPool pool;
    if ((pools) != null) {
        pool = pools.get(poolId);
        if ((pool.vipId) != null)
            vips.get(pool.vipId).pools.remove(poolId);
        
        pools.remove(poolId);
        return 0;
    }else {
        return -1;
    }
}