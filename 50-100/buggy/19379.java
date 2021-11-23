private void buildHomeMeterCard(jonasandtim.energietagebuch.Data.Calculations.StatsCardContent content) {
    _text_description_left.setText("Verbrauch bisher:");
    _text_value_left.setText(java.lang.String.format("%.1f %s", content.mAbsoluteUsageinTimeSpace, content.mUnitShort));
    _text_description_right.setText("Durchschnitt:");
    _text_value_right.setText(java.lang.String.format("%.1f %s/%s", content.mAverageUsageInTimeSpace, content.mUnitShort, "Tag"));
    if ((content.mTree.containsPredictedValues()) && (!(content.mTree.containsRawData()))) {
        _text_description_left.setText("Verbrauch \n (errechnet):");
        _text_value_left.setText(java.lang.String.format("%.1f %s", content.mAbsoluteCalculatedUsage, content.mUnitShort));
    }
}