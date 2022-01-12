@java.lang.Override
public void success(com.northernwall.hadrian.domain.WorkItem workItem) {
    dataAccess.deleteVip(workItem.getService().serviceId, workItem.getVip().vipId);
    dataAccess.deleteSearch(SearchSpace.vipFqdn, (((workItem.getVip().dns) + ".") + (workItem.getVip().domain)), workItem.getVip().vipId);
}