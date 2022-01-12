public void onSwipeLeft() {
    if (!(org.eyeseetea.malariacare.utils.GradleVariantConfig.isSwipeActionActive())) {
        return ;
    }
    android.util.Log.d(org.eyeseetea.malariacare.layout.adapters.survey.DynamicTabAdapter.TAG, "onSwipeLeft(next)");
    if ((readOnly) || (navigationController.isNextAllowed())) {
        hideKeyboard(listView.getContext(), listView);
        next();
    }
}