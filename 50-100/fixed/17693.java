private java.lang.Long matchesIndustryJob(final net.nikr.eve.jeveasset.gui.tabs.jobs.MyIndustryJob industryJob, boolean add) {
    if (industryJob != null) {
        return matches(add, industryJob.getProductTypeID(), industryJob.getOwnerID(), null, null, industryJob.getLocation(), null, null, industryJob, null, null);
    }else {
        return null;
    }
}