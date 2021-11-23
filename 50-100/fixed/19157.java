private java.util.List<org.onebusaway.transit_data.model.StopBean> getStopsForBounds(org.onebusaway.geospatial.model.CoordinateBounds bounds) {
    if (bounds != null) {
        org.onebusaway.transit_data.model.SearchQueryBean queryBean = new org.onebusaway.transit_data.model.SearchQueryBean();
        queryBean.setType(SearchQueryBean.EQueryType.BOUNDS_OR_CLOSEST);
        queryBean.setBounds(bounds);
        queryBean.setMaxCount(java.lang.Integer.MAX_VALUE);
        org.onebusaway.transit_data.model.StopsBean stops = _nycTransitDataService.getStops(queryBean);
        return stops.getStops();
    }
    return new java.util.ArrayList<org.onebusaway.transit_data.model.StopBean>();
}