private void appendText(java.lang.String text, java.lang.String clazz) {
    java.util.Map.Entry<java.lang.Integer, org.rstudio.core.client.VirtualConsole.ClassRange> last = class_.lastEntry();
    org.rstudio.core.client.VirtualConsole.ClassRange range = last.getValue();
    if ((range.clazz) == clazz) {
        range.appendRight(text, 0);
    }else {
        final org.rstudio.core.client.VirtualConsole.ClassRange newRange = new org.rstudio.core.client.VirtualConsole.ClassRange(cursor_, clazz, text);
        parent_.appendChild(newRange.element);
        class_.put(cursor_, newRange);
    }
}