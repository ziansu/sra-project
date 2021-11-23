private void collapseViews(android.view.View fab, final boolean collapsing) {
    android.animation.Animator fabAnimator = (collapsing) ? com.application.material.bookmarkswallet.app.animator.AnimatorBuilder.getInstance(com.application.material.bookmarkswallet.app.manager.SearchManager.context).buildHideAnimator(fab, false) : com.application.material.bookmarkswallet.app.animator.AnimatorBuilder.getInstance(com.application.material.bookmarkswallet.app.manager.SearchManager.context).buildShowAnimator(fab, false);
    fabAnimator.start();
}