@java.lang.Override
public void call(final org.json.JSONArray properties) throws org.json.JSONException {
    org.vaadin.visjs.networkDiagram.SelectEvent event = org.vaadin.visjs.networkDiagram.EventGenerator.getNodeSelectEvent(properties);
    fireNodeSelectEvent(event);
}