public static java.lang.String getFormattedToSignificantFigures(double number, int significantFigures) {
    double roundToSignificantFigures = us.ihmc.tools.FormattingTools.roundToSignificantFigures(number, significantFigures);
    if ((java.lang.Math.abs(roundToSignificantFigures)) >= (java.lang.Math.pow(10, (significantFigures - 1))))
        return java.lang.String.valueOf(((int) (roundToSignificantFigures)));
    else
        return java.lang.String.valueOf(roundToSignificantFigures);
    
}