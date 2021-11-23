protected org.miradi.objects.BaseObject getSingleSelectedObject() {
    org.miradi.objects.BaseObject[] selectedObjects = getObjects();
    if ((selectedObjects.length) != 1)
        return null;
    
    return selectedObjects[0];
}