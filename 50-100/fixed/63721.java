private static java.lang.String asIndexedList(java.util.List<java.lang.String> listItems) {
    final java.lang.StringBuilder formatted = new java.lang.StringBuilder();
    int displayIndex = 0 + (ruby.keyboardwarrior.ui.Formatter.DISPLAYED_INDEX_OFFSET);
    for (java.lang.String listItem : listItems) {
        if (displayIndex == (listItems.size()))
            formatted.append(ruby.keyboardwarrior.ui.Formatter.getIndexedListItem(displayIndex, listItem));
        else
            formatted.append(ruby.keyboardwarrior.ui.Formatter.getIndexedListItem(displayIndex, listItem)).append("\n");
        
        displayIndex++;
    }
    return formatted.toString();
}