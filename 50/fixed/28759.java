@java.lang.Override
public void onStop() {
    super.onStop();
    releasePlayer();
    if ((com.yomiolatunji.bakerapp.ui.RecipeStepFragment.mMediaSession) != null)
        com.yomiolatunji.bakerapp.ui.RecipeStepFragment.mMediaSession.setActive(false);
    
}