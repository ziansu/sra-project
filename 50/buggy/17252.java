private void appendPojoItem(boolean hasNext, java.lang.Object object, java.lang.String indentOffset) {
    this.stringBuilder.append(indentOffset);
    this.render(object);
    if (hasNext)
        this.stringBuilder.append(",");
    
    this.stringBuilder.append("\n");
}