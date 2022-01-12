public void setInnerText(java.lang.String setThisText) {
    super.clear(true);
    currentActiveLabel = setupLabel(setThisText, null);
    super.add(currentActiveLabel);
}