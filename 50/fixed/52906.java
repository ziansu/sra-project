@org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
public void showRecipeStep(io.arfirman1402.dev.myclassicbakingapp.event.RecipeStepEvent event) {
    if ((mSelectedPosition) != (event.getSelectedPosition())) {
        mSelectedPosition = event.getSelectedPosition();
        showRecipeStepFragment(mRecipeSteps.get(mSelectedPosition));
    }
}