public java.util.List<java.lang.String> completeFeedName(java.lang.String incompleteName) {
    java.lang.System.out.println(("completeFeedName " + incompleteName));
    se.vgregion.ifeed.service.ifeed.Filter sample = new se.vgregion.ifeed.backingbeans.FilterModel();
    sample.setName(incompleteName);
    java.util.List<se.vgregion.ifeed.backingbeans.IFeed> result = iFeedService.getIFeedsByFilter(sample, 0, 10);
    java.util.List<java.lang.String> names = new java.util.ArrayList<java.lang.String>();
    for (se.vgregion.ifeed.backingbeans.IFeed iFeed : result) {
        names.add(iFeed.getName());
    }
    return names;
}