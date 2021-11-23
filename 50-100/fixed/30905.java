public void fadeOut(com.badlogic.gdx.math.Matrix4 cameraCombined, float delta) {
    fadeInLight.setActive(false);
    fadeOutLight.setActive(true);
    if ((timePassedDuringFadeOut) < (timeToFadeOut)) {
        fadeOutAlpha = 1 - ((timePassedDuringFadeOut) / (timeToFadeOut));
        fadeOutLight.setColor(new com.badlogic.gdx.graphics.Color(0, 0, 0, fadeOutAlpha));
        rayHandler.setCombinedMatrix(cameraCombined);
        timePassedDuringFadeOut += delta;
    }
    rayHandler.updateAndRender();
}