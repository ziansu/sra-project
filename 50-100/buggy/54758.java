@java.lang.Override
public mage.MageObject getSourceObjectIfItStillExists(mage.game.Game game) {
    mage.MageObject currentObject = game.getObject(getSourceId());
    if (currentObject != null) {
        if ((sourceObject) == null) {
            setSourceObject(currentObject, game);
        }
        mage.MageObjectReference mor = new mage.MageObjectReference(currentObject, game);
        if ((mor.getZoneChangeCounter()) == (getSourceObjectZoneChangeCounter())) {
            return sourceObject;
        }
    }
    return null;
}