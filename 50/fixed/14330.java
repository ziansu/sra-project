public mpicbg.models.CoordinateTransform createTransform() throws java.lang.IllegalArgumentException {
    if (((instance) == null) && ((validationInstance) != null)) {
        instance = validationInstance;
    }else {
        instance = createAndInitTransform();
    }
    return instance;
}