public int compare(org.impalaframework.service.ServiceRegistryEntry o1, org.impalaframework.service.ServiceRegistryEntry o2) {
    int o2ranking = getServiceRanking(o2);
    int o1ranking = getServiceRanking(o1);
    if (o2ranking > o1ranking) {
        return 1;
    }
    if (o2ranking < o1ranking) {
        return -1;
    }
    return 0;
}