public java.util.ArrayList<java.lang.Object> checkObjectFor(com.badlogic.gdx.maps.MapLayer layer, java.lang.String property) {
    java.util.ArrayList<java.lang.Object> o = new java.util.ArrayList<java.lang.Object>();
    com.badlogic.gdx.maps.MapObjects objects = layer.getObjects();
    for (com.badlogic.gdx.maps.MapObject object : objects) {
        if (object.getProperties().containsKey(property)) {
            o.add(object);
        }
    }
    return o;
}