public static com.amagh.bakemate.ui.StepDetailsFragment newInstance(com.amagh.bakemate.models.Step step) {
    android.os.Bundle args = new android.os.Bundle();
    args.putParcelable(com.amagh.bakemate.ui.StepDetailsFragment.BundleKeys.STEP, step);
    com.amagh.bakemate.ui.StepDetailsFragment fragment = new com.amagh.bakemate.ui.StepDetailsFragment();
    fragment.setArguments(args);
    return fragment;
}