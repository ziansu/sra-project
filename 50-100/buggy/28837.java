public org.knowrob.vis.MarkerObject createMarker(java.lang.String identifier) {
    org.knowrob.vis.MarkerObject obj = publisher.createMarker(identifier);
    obj.setType(getType());
    obj.setScale(getScale());
    obj.setColor(getColor());
    obj.setTfPrefix(tfPrefix);
    children.add(obj);
    return obj;
}