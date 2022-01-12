public void updateTextSize(boolean isNight, int textColor, int textShadowColor, boolean textBold, int shadowRadius) {
    this.shadowRadius = shadowRadius;
    net.osmand.plus.views.mapwidgets.TextInfoWidget.updateTextColor(lanesText, lanesShadowText, textColor, textShadowColor, textBold, shadowRadius);
}