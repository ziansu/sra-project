protected org.metawidget.statically.spring.widgetbuilder.FormSelectTag createFormSelectTag(java.lang.String expression, java.util.Map<java.lang.String, java.lang.String> attributes) {
    org.metawidget.statically.spring.widgetbuilder.FormSelectTag select = new org.metawidget.statically.spring.widgetbuilder.FormSelectTag();
    if (org.metawidget.util.WidgetBuilderUtils.needsEmptyLookupItem(attributes)) {
        org.metawidget.statically.spring.widgetbuilder.FormOptionTag emptyOption = new org.metawidget.statically.spring.widgetbuilder.FormOptionTag();
        emptyOption.putAttribute("value", "");
        select.getChildren().add(emptyOption);
    }
    org.metawidget.statically.spring.widgetbuilder.FormOptionsTag options = new org.metawidget.statically.spring.widgetbuilder.FormOptionsTag();
    options.putAttribute("items", expression);
    return select;
}