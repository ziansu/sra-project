private void moveToNextFragment() {
    getMyBaseActivity().showBigAdsIfNeeded();
    com.essential.indodriving.ui.fragment.test.OverallResultFragment fragment = new com.essential.indodriving.ui.fragment.test.OverallResultFragment();
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putBoolean(Constants.BUNDLE_NEED_SAVING, false);
    bundle.putString(Constants.BUNDLE_FRAGMENT_TYPE, com.essential.indodriving.ui.fragment.test.WrittenTestFragment.TAG_WRITTEN_TEST_FRAGMENT);
    android.util.Log.e("Questions size 2", ("" + (questions.size())));
    putHolder(Constants.KEY_HOLDER_QUESTIONS, questions);
    fragment.setArguments(bundle);
    replaceFragment(fragment, com.essential.indodriving.ui.fragment.test.WrittenTestFragment.TAG_WRITTEN_TEST_FRAGMENT);
}