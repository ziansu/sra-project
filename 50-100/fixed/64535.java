public static java.lang.String asString(java.util.Collection<java.lang.Long> activities) {
    if (activities == null)
        return "";
    
    java.lang.String str = "";
    for (java.lang.Long actId : activities) {
        org.sleepfactory.sleeplog.scale.Activity act = org.sleepfactory.sleeplog.scale.Activity.enumValueOf(actId);
        str += (act.qualitative()) + ", ";
    }
    if (str.contains(","))
        str = str.substring(0, ((str.length()) - 2));
    
    return str;
}