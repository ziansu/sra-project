private void appendPojoItem(java.lang.Object object, boolean hasNext, java.lang.String indentOffset) {
    this.stringBuilder.append(indentOffset);
    this.render(object);
    if (hasNext)
        this.stringBuilder.append(",");
    
    this.stringBuilder.append("\n");
}