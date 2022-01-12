@java.lang.Override
protected void updateItem(java.lang.String item, boolean empty) {
    super.updateItem(item, empty);
    javafx.collections.ObservableList<javafx.scene.Node> flowPaneChildren = flowPane.getChildren();
    flowPaneChildren.clear();
    if (!empty) {
        org.stt.text.ItemCategorizer.ItemCategory category = worktimeCategorizer.getCategory(item);
        switch (category) {
            case BREAK :
                colorizeBreakTime(item, flowPaneChildren);
                break;
            case WORKTIME :
            default :
                colorizeGroups(item, flowPaneChildren);
                break;
        }
    }
    setGraphic(flowPane);
}