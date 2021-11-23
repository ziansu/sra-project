public creator.soft.cygi.com.friendlyloseweighthelper.dto.DateTimeDTO getPreviousMeasurement() {
    creator.soft.cygi.com.friendlyloseweighthelper.dto.DateTimeDTO dateTimeDTO;
    if ((userPosition) == null) {
        userPosition = getLatestMeasurementPosition();
        dateTimeDTO = databaseData.get(userPosition);
    }else {
        if ((userPosition) > 0) {
            (userPosition)--;
        }
        dateTimeDTO = databaseData.get(userPosition);
    }
    notifyPositionChanged();
    return dateTimeDTO;
}