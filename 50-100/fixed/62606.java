private javafx.scene.Node getContent() {
    if ((content) == null) {
        tornadofx.control.TableRowExpander.TableRowDataFeatures<S> features = new tornadofx.control.TableRowExpander.TableRowDataFeatures(tableRow, expanderColumn, getSkinnable().getItem());
        content = expandedNodeBuilder.call(features);
        getChildren().add(content);
    }
    return content;
}