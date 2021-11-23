private void setFilters(java.util.Collection<java.lang.String> whitelist) {
    if ((whitelist.size()) > 0) {
        filters.add(new org.sosy_lab.ccvisu.readers.filter.WhitelistFilter(whitelist));
    }
    if ((getOption(org.sosy_lab.ccvisu.Options.OptionsEnum.sort).getBool()) || (!(getOption(org.sosy_lab.ccvisu.Options.OptionsEnum.uniq).getBool()))) {
        filters.add(new org.sosy_lab.ccvisu.readers.filter.Sort());
    }
    if (getOption(org.sosy_lab.ccvisu.Options.OptionsEnum.uniq).getBool()) {
        filters.add(new org.sosy_lab.ccvisu.readers.filter.Uniq());
    }
}