public static java.lang.String loadJsonArrayAppend(java.lang.String fileName) {
    java.lang.StringBuilder sb = com.adsamcik.signalcollector.utility.DataStore.loadStringAsBuilder(fileName);
    if ((sb != null) && ((sb.length()) != 0)) {
        sb.setCharAt(0, '[');
        sb.append(']');
        return sb.toString();
    }
    return null;
}