public void pull(nl.tudelft.scrumbledore.LevelElement element) {
    if (element == null) {
        return ;
    }
    if (!(element.hasGravity())) {
        return ;
    }
    int vspeed = element.getSpeed().getY();
    if (((max) - vspeed) >= (strength)) {
        element.getSpeed().setY((vspeed + (strength)));
    }else {
        element.getSpeed().setY(max);
    }
}