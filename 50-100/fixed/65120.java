@java.lang.Override
public void addDataDomainRecalcer(final de.yaio.core.datadomainservice.DataDomainRecalc dataDomainRecalcer) {
    if ((dataDomainRecalcer.getRecalcTargetOrder()) < 0) {
        if (de.yaio.core.nodeservice.NodeServiceImpl.LOGGER.isDebugEnabled()) {
            de.yaio.core.nodeservice.NodeServiceImpl.LOGGER.debug(((("SKIP: Targetorder < 0 TargetOrder:" + (dataDomainRecalcer.getRecalcTargetOrder())) + " Recalcer:") + (dataDomainRecalcer.getClass().getName())));
        }
        return ;
    }
    this.hshDataDomainRecalcer.add(dataDomainRecalcer);
    this.hshDataDomainRecalcerByClass.put(dataDomainRecalcer.getClass(), dataDomainRecalcer);
}