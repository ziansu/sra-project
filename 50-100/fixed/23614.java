protected void resizeAxis() {
    int minSize = ((labelMaxWidth) + (fr.inria.soctrace.tools.ocelotl.visualizations.temporal.proportion.views.ProportionAxisView.TextPositionOffset)) + ((areaWidth) - (mainLineXPosition));
    if (((areaWidth) < minSize) && (((ocelotlView.getMainViewTopSashform().getSize().x) - minSize) > 0))
        ocelotlView.getMainViewTopSashform().setWeights(new int[]{ minSize , (ocelotlView.getMainViewTopSashform().getSize().x) - minSize });
    
}