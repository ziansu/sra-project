@java.lang.Override
public void onStop() {
    super.onStop();
    releasePlayer();
    com.yomiolatunji.bakerapp.ui.RecipeStepFragment.mMediaSession.setActive(false);
}