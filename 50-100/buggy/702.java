public void attachThis(com.lostagain.nl.GWTish.Management.IsAnimatableModelInstance objectToAttach, com.lostagain.nl.GWTish.PosRotScale displacement) {
    if (!(attachlist.containsKey(objectToAttach))) {
        objectToAttach.setParentObject(this);
        attachlist.put(objectToAttach, displacement);
    }else {
        Gdx.app.log(com.lostagain.nl.me.camera.AnimatableOrthographicCamera.logstag, ("updating attachment:" + (displacement.toString())));
        attachlist.put(objectToAttach, displacement);
        sycnAttachedObjectsPosition(objectToAttach);
    }
}