private boolean isValidRegion(com.scv.slackgo.models.Region region) {
    if (!(com.scv.slackgo.helpers.Preferences.areRegionsEmpty(this))) {
        if ((regionsList) == null) {
            return true;
        }else {
            for (com.scv.slackgo.models.Region regionInList : regionsList) {
                if (region.getName().equals(regionInList.getName())) {
                    return false;
                }
            }
        }
    }
    return true;
}