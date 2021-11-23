protected void resizeAxis() {
    int minSize = ((labelMaxWidth) + (fr.inria.soctrace.tools.ocelotl.visualizations.temporal.proportion.views.ProportionAxisView.TextPositionOffset)) + ((areaWidth) - (mainLineXPosition));
    if (minSize > (areaWidth)) {
        ocelotlView.getMainViewTopSashform().setWeights(new int[]{ minSize , (ocelotlView.getMainViewTopSashform().getSize().y) - minSize });
    }
}