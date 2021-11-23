public void fadeIn(com.badlogic.gdx.math.Matrix4 cameraCombined, float delta) {
    fadeOutLight.setActive(false);
    fadeInLight.setActive(true);
    if ((timePassedDuringFadeIn) < (timeToFadeIn)) {
        fadeInAlpha = 1 - ((timePassedDuringFadeIn) / (timeToFadeIn));
        fadeInLight.setColor(new com.badlogic.gdx.graphics.Color(0, 0, 0, (1 - (fadeInAlpha))));
        rayHandler.setCombinedMatrix(cameraCombined);
        rayHandler.updateAndRender();
        timePassedDuringFadeIn += delta;
    }else {
        isNewLevel = false;
    }
}