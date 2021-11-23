public java.util.ArrayList<com.badlogic.gdx.maps.MapObject> checkObjectFor(com.badlogic.gdx.maps.MapLayer layer, java.lang.String property) {
    java.util.ArrayList<com.badlogic.gdx.maps.MapObject> o = new java.util.ArrayList<com.badlogic.gdx.maps.MapObject>();
    com.badlogic.gdx.maps.MapObjects objects = layer.getObjects();
    for (com.badlogic.gdx.maps.MapObject object : objects) {
        if (object.getProperties().containsKey(property)) {
            o.add(object);
        }
    }
    return o;
}