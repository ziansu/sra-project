boolean trendingToAlertEnd(com.eveningoutpost.dexdrip.Models.AlertType Alert) {
    if (!(com.eveningoutpost.dexdrip.UtilityModels.Notifications.smart_snoozing)) {
        return false;
    }
    return com.eveningoutpost.dexdrip.Models.BgReading.trendingToAlertEnd(Alert.above);
}