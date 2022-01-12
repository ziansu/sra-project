public boolean addSourceReport(double latitude, double longitude, java.lang.String waterType, java.lang.String waterCondition) {
    ruggedoutdoors.cleanwater.model.Reports.add(new ruggedoutdoors.cleanwater.model.SourceReport(currentUser, new ruggedoutdoors.cleanwater.model.Location(latitude, longitude), ruggedoutdoors.cleanwater.model.WaterType.valueOf(waterType.toUpperCase()), ruggedoutdoors.cleanwater.model.WaterCondition.valueOf(waterCondition.toUpperCase())));
    return true;
}