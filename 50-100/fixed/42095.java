@java.lang.Override
public int getItemViewType(int position) {
    if (position == 0) {
        return locationInformationViewType;
    }else
        if (position == 1) {
            return createNewImpressionViewType;
        }
    
    com.locator_app.locator.model.impressions.AbstractImpression.ImpressionType type = impressions.get((position - (numberOfAdditionalInfoTypes))).type();
    return supportedImpressionTypes.indexOf(type);
}