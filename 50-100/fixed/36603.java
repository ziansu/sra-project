public static java.lang.String getSubsettingsSelectedMenuName(java.lang.String settingsName) {
    java.lang.String subsettingsSelectedName = null;
    switch (settingsName) {
        case "Maps" :
            subsettingsSelectedName = cat.app.osmap.SavedOptions.selectedMap;
            break;
        case "Travel" :
            subsettingsSelectedName = cat.app.osmap.SavedOptions.selectedTravelMode;
            break;
        case "Navigate" :
            subsettingsSelectedName = cat.app.osmap.SavedOptions.routingProvider;
            break;
        case "On Road" :
            subsettingsSelectedName = cat.app.osmap.SavedOptions.selectedOnRoad;
            break;
    }
    return subsettingsSelectedName;
}