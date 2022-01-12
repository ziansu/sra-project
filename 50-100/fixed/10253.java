public void setElements(java.util.List<?> texts, boolean[] selected) {
    int size = (texts == null) ? 0 : texts.size();
    setElements(texts.toArray(new java.lang.String[size]), null, selected);
}