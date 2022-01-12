java.util.List<java.lang.String> getAliases() {
    return myNames.subList((((myNames.size()) - 1) >= 1 ? 1 : 0), myNames.size());
}