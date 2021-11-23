private javafx.scene.Node getContent() {
    if ((content) == null) {
        tornadofx.control.TableRowExpander.TableRowDataFeatures<S> features = new tornadofx.control.TableRowExpander.TableRowDataFeatures(expanderColumn, tableRow, getSkinnable().getItem());
        content = expandedNodeBuilder.call(features);
        getChildren().add(content);
    }
    return content;
}