public static Input.Orientation getOrientation() {
    int rotation = Gdx.input.getRotation();
    Gdx.app.log("rotation", java.lang.Integer.toString(rotation));
    if ((((Gdx.input.getNativeOrientation()) == (Input.Orientation.Portrait)) && ((rotation == 0) || (rotation == 180))) || (((Gdx.input.getNativeOrientation()) == (Input.Orientation.Landscape)) && ((rotation == 90) || (rotation == 270)))) {
        return Input.Orientation.Portrait;
    }else
        return Input.Orientation.Landscape;
    
}