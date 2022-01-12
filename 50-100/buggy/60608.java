public void addObject(se.tribestar.mage.world.GameObject object) {
    if (!(namedObjects.containsKey(object.name))) {
        namedObjects.put(object.name, new java.util.ArrayList<se.tribestar.mage.world.GameObject>());
        namedObjects.get(object.name).add(object);
    }
    if (object instanceof se.tribestar.mage.world.drawable.Drawable) {
        drawables.add(((se.tribestar.mage.world.drawable.Drawable) (object)));
        controller.loadObject(object);
    }
    objects.add(object);
}