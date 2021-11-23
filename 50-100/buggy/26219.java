public void setTypeAndId(com.next.eswaraj.config.TimelineType type, java.lang.Long id) {
    this.type = type;
    this.id = id;
    if ((getActivity()) != null) {
        middlewareService.loadTimeline(getActivity(), type, id, totalCount, requestCount);
        dataDownloadStarted = true;
    }
}