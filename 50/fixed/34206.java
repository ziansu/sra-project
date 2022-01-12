public static com.flaredown.flaredownApp.Checkin.FlaringQuestionFragment newInstance(boolean isSummaryView) {
    com.flaredown.flaredownApp.Checkin.FlaringQuestionFragment fragment = new com.flaredown.flaredownApp.Checkin.FlaringQuestionFragment();
    android.os.Bundle args = new android.os.Bundle();
    args.putBoolean(com.flaredown.flaredownApp.Checkin.FlaringQuestionFragment.ARG_SUMMARY_VIEW, isSummaryView);
    fragment.setArguments(args);
    return fragment;
}