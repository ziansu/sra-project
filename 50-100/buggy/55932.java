public static java.lang.String getStimulusId(org.opentestsystem.ap.common.model.Item item) {
    java.lang.String stimId = "";
    if (null != item) {
        if (item instanceof org.opentestsystem.ap.common.model.SaItem) {
            stimId = ((org.opentestsystem.ap.common.model.SaItem) (item)).getStimulusId();
        }else
            if (item instanceof org.opentestsystem.ap.common.model.WerItem) {
                stimId = ((org.opentestsystem.ap.common.model.WerItem) (item)).getStimulusId();
            }else
                if (item instanceof org.opentestsystem.ap.common.model.McItem) {
                    stimId = ((org.opentestsystem.ap.common.model.McItem) (item)).getStimulusId();
                }
            
        
    }
    return stimId;
}