public java.util.Collection<java.lang.String> getIncFilesFilterPatternRegExpList() {
    java.util.Collection<java.lang.String> incFilesFilterPatternRegExpList = this.preferences.getIncFilesFilterPatternRegExpList();
    if ((incFilesFilterPatternRegExpList == null) || (incFilesFilterPatternRegExpList.isEmpty())) {
        incFilesFilterPatternRegExpList = new java.util.ArrayList<>();
        incFilesFilterPatternRegExpList.add("(.*?)\\.(jpg|jpeg|png|gif)");
        incFilesFilterPatternRegExpList.add("(.*?)\\.(reg)");
        this.preferences.setIncFilesFilterPatternRegExpList(incFilesFilterPatternRegExpList);
    }
    return incFilesFilterPatternRegExpList;
}