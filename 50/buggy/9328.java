private void setup2dCam() {
    cam = new com.badlogic.gdx.graphics.OrthographicCamera();
    cam.setToOrtho(false, ((edu.chalmers.RunningMan.RunningMan.V_WIDTH) / (edu.chalmers.RunningMan.utils.B2DVariables.PPM)), ((edu.chalmers.RunningMan.RunningMan.V_HEIGHT) / (edu.chalmers.RunningMan.utils.B2DVariables.PPM)));
}