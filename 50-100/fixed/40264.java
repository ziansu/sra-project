private void createBackground() {
    attachChild(new org.andengine.entity.sprite.Sprite(((com.github.liosha2007.android.adventuresofpokemons.GameActivity.CAMERA_WIDTH) / 2), ((com.github.liosha2007.android.adventuresofpokemons.GameActivity.CAMERA_HEIGHT) / 2), com.github.liosha2007.android.adventuresofpokemons.GameActivity.CAMERA_WIDTH, com.github.liosha2007.android.adventuresofpokemons.GameActivity.CAMERA_HEIGHT, resourcesManager.menu_background_region, vbom) {
        @java.lang.Override
        protected void preDraw(org.andengine.opengl.util.GLState pGLState, org.andengine.engine.camera.Camera pCamera) {
            super.preDraw(pGLState, pCamera);
            pGLState.enableDither();
        }
    });
}