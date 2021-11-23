public void setCurrentSection(java.lang.Integer index) {
    if (index == null) {
        currentSection = null;
    }else {
        currentSection = sections.get(index);
    }
}