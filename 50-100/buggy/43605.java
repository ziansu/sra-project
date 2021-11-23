@java.lang.Override
public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
    filterBox.getElement().removeAttribute("disabled");
    try {
        filterBox.clear();
        java.util.List<java.lang.String> types = blockArea.getBlockTypes("");
        for (java.lang.String type : types) {
            filterBox.addItem(type);
        }
    } catch (java.lang.ClassCastException e) {
    }
}