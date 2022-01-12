private void updateScreenWrapperStatus(double moveX, double moveY, double currentScale, com.htmlhifive.pitalium.core.model.ScreenshotParams params) {
    LOG.trace("(UpdateScreenWrapperStatus) moveX: {}, moveY: {}, scale: {} => {}", moveX, moveY, currentScale, params.getTarget().getParent());
    params.getTarget().updatePosition(currentScale, moveX, moveY);
    for (com.htmlhifive.pitalium.core.model.ScreenAreaWrapper wrapper : params.getExcludes()) {
        wrapper.updatePosition(currentScale, moveX, moveY);
    }
}