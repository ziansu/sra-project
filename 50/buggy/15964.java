public void checkForNewAnimations(Game.View.RenderInfo renderInfo) {
    if (!(settings.isConsoleMode())) {
        if ((renderInfo.toAnimate.size()) > 0) {
            animator.startAnimation(renderInfo.toAnimate);
            renderInfo.toAnimate.clear();
        }
    }
}