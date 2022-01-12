public static void addRegionToSharedPreferences(android.app.Activity activity, com.scv.slackgo.models.Region region) {
    java.util.ArrayList<com.scv.slackgo.models.Region> listOfRegions = new java.util.ArrayList<com.scv.slackgo.models.Region>();
    if (!(com.scv.slackgo.helpers.Preferences.areRegionsEmpty(activity))) {
        listOfRegions.addAll(com.scv.slackgo.helpers.Preferences.getRegionsList(activity));
    }
    com.scv.slackgo.helpers.Preferences.removeDataFromSharedPreferences(activity, Constants.SHARED_PREFERENCES_REGIONS);
    if (!(listOfRegions.contains(region))) {
        listOfRegions.add(region);
    }
    com.scv.slackgo.helpers.Preferences.addRegionsListToSharedPreferences(activity, listOfRegions);
}