protected java.lang.String calcWhereThirdDimToken(final hm.edu.swe2.flysoft.ui.FilterSetting settings) {
    java.lang.String thirdDimColumn;
    switch (settings.getThirdDimension().toLowerCase()) {
        case hm.edu.swe2.flysoft.util.GlobalSettings.TIME :
            thirdDimColumn = "WHERE FE.departuretime BETWEEN ?1 and ?2\n";
            break;
        case hm.edu.swe2.flysoft.util.GlobalSettings.AIRLINE :
            thirdDimColumn = "WHERE AIR.name IN (?3)\n";
            break;
        case hm.edu.swe2.flysoft.util.GlobalSettings.DESTINATION :
            thirdDimColumn = "WHERE DESTC.name IN (?4)\n";
            break;
        case hm.edu.swe2.flysoft.util.GlobalSettings.ORIGIN :
            thirdDimColumn = "WHERE ORIGC.name IN (?5)\n";
            break;
        default :
            thirdDimColumn = "WHERE DESTC.name IN (?4)\n";
    }
    return thirdDimColumn;
}