public static java.lang.String getEnding(int i) {
    if (i < 3)
        return "th";
    else
        return SchoolNavigator.SchoolMap.endings.get(i);
    
}