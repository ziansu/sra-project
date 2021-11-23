private boolean matchesIndustryJob(final net.nikr.eve.jeveasset.gui.tabs.jobs.MyIndustryJob industryJob, boolean add) {
    return (industryJob != null) && (matches(add, industryJob.getProductTypeID(), industryJob.getOwnerID(), null, null, industryJob.getLocation(), null, null, industryJob, null, null));
}