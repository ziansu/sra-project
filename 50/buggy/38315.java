public static java.lang.String formatDistanceBySmoots(java.lang.Double distance) {
    double smoots = distance * (edu.mit.mitmobile2.tour.utils.TourUtils.SMOOTS_PER_METER);
    java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("0.00");
    return (decimalFormat.format(smoots)) + " Smoots";
}