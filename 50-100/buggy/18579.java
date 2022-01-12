public static void interact(org.rev317.min.api.methods.SceneObject object, org.rev317.min.api.methods.SceneObjects.Option action) {
    if (org.rev317.min.api.methods.Game.hasAction4()) {
        org.rev317.min.api.methods.Menu.sendAction(action.getActionId(), object.getHash(), object.getLocalRegionX(), object.getLocalRegionY(), object.getId(), 0);
    }else {
        org.rev317.min.api.methods.Menu.sendAction(action.getActionId(), object.getHash(), object.getLocalRegionX(), object.getLocalRegionY());
    }
}