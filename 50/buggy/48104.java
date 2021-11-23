void moveInFrontOf(soga2d.GraphicObject object, soga2d.GraphicObject inFrontOfWhat) {
    items.remove(object);
    int index = items.indexOf(inFrontOfWhat);
    if (index != (-1))
        items.add(index, object);
    
}