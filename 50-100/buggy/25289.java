private java.lang.String getTimeStampDifference() {
    try {
        long serverTimeStamp = java.lang.Long.parseLong(getTimeStamp());
        long nowTimeStamp = java.lang.System.currentTimeMillis();
        long difference = java.lang.Math.abs((((nowTimeStamp - (serverTimeStamp + ((2L * 1000L) * 60L))) / 1000L) / 60L));
        return java.lang.String.valueOf(difference);
    } catch (java.lang.NumberFormatException e) {
        return "";
    }
}