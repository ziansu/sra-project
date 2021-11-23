public void setProperties(java.lang.String minInstancesQuery, java.lang.String maxInstancesQuery, java.lang.String thresholdQuery, java.lang.String creationMode) {
    try {
        _minInstances = new java.lang.Integer(minInstancesQuery);
    } catch (java.lang.NumberFormatException e) {
        _minInstancesQuery = minInstancesQuery;
    }
    try {
        _maxInstances = new java.lang.Integer(maxInstancesQuery);
    } catch (java.lang.NumberFormatException e) {
        _maxInstancesQuery = maxInstancesQuery;
    }
    try {
        _threshold = new java.lang.Integer(thresholdQuery);
    } catch (java.lang.NumberFormatException e) {
        _thresholdQuery = thresholdQuery;
    }
    _creationMode = creationMode;
}