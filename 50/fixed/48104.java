void moveInFrontOf(soga2d.GraphicObject object, soga2d.GraphicObject inFrontOfWhat) {
    if ((items.indexOf(inFrontOfWhat)) != (-1)) {
        items.remove(object);
        items.add(items.indexOf(inFrontOfWhat), object);
    }
}