public static Input.Orientation getOrientation() {
    int rotation = Gdx.input.getRotation();
    if ((((Gdx.input.getNativeOrientation()) == (Input.Orientation.Portrait)) && ((rotation == 0) || (rotation == 180))) || (((Gdx.input.getNativeOrientation()) == (Input.Orientation.Landscape)) && ((rotation == 90) || (rotation == 270)))) {
        return Input.Orientation.Portrait;
    }else
        return Input.Orientation.Landscape;
    
}