public void route(java.util.List<java.util.Map<java.lang.String, java.lang.Object>> events) throws java.lang.Exception {
    if (events != null) {
        for (java.util.Map<java.lang.String, java.lang.Object> event : events) {
            this.routeSelect.route(event);
        }
    }
}