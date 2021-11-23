@java.lang.Override
protected void loadPlugins() {
    pickingPlugin = new edu.uci.ics.jung.visualization.control.PickingGraphMousePlugin<model.Vertex, model.Edge>();
    editingPlugin = new control.MyEditingGraphMousePlugin<model.Vertex, model.Edge>(vertexFactory, edgeFactory);
    annotatingPlugin = new edu.uci.ics.jung.visualization.annotations.AnnotatingGraphMousePlugin<model.Vertex, model.Edge>(rc);
    popupEditingPlugin = new control.MyPopupPlugin(vertexFactory, edgeFactory);
    add(scalingPlugin);
    setMode(Mode.EDITING);
}