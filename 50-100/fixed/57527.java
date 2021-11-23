public static azubakov.edu.caloriescalc.dialogs.MealSummaryFragment newInstance(java.lang.String category) {
    android.os.Bundle args = new android.os.Bundle();
    args.putString(azubakov.edu.caloriescalc.dialogs.MealSummaryFragment.ARG_CATEGORY, category);
    azubakov.edu.caloriescalc.dialogs.MealSummaryFragment fragment = new azubakov.edu.caloriescalc.dialogs.MealSummaryFragment();
    fragment.setArguments(args);
    fragment.summary = new azubakov.edu.caloriescalc.models.MealSummary(0, 0, 0, 0, 0, 0, 0, 0, category);
    return fragment;
}