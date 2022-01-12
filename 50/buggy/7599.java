public static com.arcao.geocaching4locus.fragment.dialog.LocusTestingErrorDialogFragment newInstance(android.content.Context context) {
    com.arcao.geocaching4locus.fragment.dialog.LocusTestingErrorDialogFragment fragment = new com.arcao.geocaching4locus.fragment.dialog.LocusTestingErrorDialogFragment();
    fragment.prepareDialog(R.string.error_title, (locus.api.android.utils.LocusUtils.isLocusAvailable(context) ? R.string.error_locus_old : R.string.error_locus_not_found), AppConstants.LOCUS_MIN_VERSION.toString());
    return fragment;
}