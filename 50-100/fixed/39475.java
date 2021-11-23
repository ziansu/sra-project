private void collection2Json(java.lang.Object object) {
    this.stringBuilder.append("[\n");
    this.jsonFormat.increaseIndent();
    java.util.Iterator iterator = ((java.util.Collection) (object)).iterator();
    java.lang.String indentOffset = this.getCurrentIndentOffset();
    while (iterator.hasNext()) {
        this.appendPojoItem(iterator.next(), iterator.hasNext(), indentOffset);
    } 
    this.jsonFormat.decreaseIndent();
    this.stringBuilder.append("]");
}