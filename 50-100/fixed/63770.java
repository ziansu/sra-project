private static java.lang.String[] getDefaultSeparators(geogebra.common.main.AbstractApplication app) {
    java.lang.String[] separators = new java.lang.String[2];
    java.text.DecimalFormatSymbols dfs = new java.text.DecimalFormatSymbols(((geogebra.main.Application) (app)).getLocale());
    separators[0] = java.lang.Character.toString(dfs.getDecimalSeparator());
    separators[1] = java.lang.Character.toString(dfs.getGroupingSeparator());
    return separators;
}