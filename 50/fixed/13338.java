public void setCurrentSection(java.lang.Integer index) {
    if ((index == null) || (index >= (sections.size()))) {
        currentSection = null;
    }else {
        currentSection = sections.get(index);
    }
}