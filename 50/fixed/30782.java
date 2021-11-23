public de.codeshelf.consoleui.prompt.builder.ListItemBuilder newItem(java.lang.String name) {
    de.codeshelf.consoleui.prompt.builder.ListItemBuilder listItemBuilder = new de.codeshelf.consoleui.prompt.builder.ListItemBuilder(this);
    return listItemBuilder.name(name).text(name);
}