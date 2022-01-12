java.lang.String add(de.hk.wfh.rs.FilterContext filterContext, java.lang.String line) {
    boolean containsFilter = containsPattern(line, filterContext.getFilterList());
    boolean containsIgnore = containsPattern(line, filterContext.getIgnoreList());
    if (containsFilter && containsIgnore) {
        return ("<- ignore-filter conflict -> " + line) + "\n";
    }else
        if (containsFilter && (!containsIgnore)) {
            return line + "\n";
        }
    
    return "\n";
}