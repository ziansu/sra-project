private void showFollowupModal(@android.support.annotation.NonNull
final org.keynote.godtools.android.snuffy.model.GtFollowupModal modal) {
    dismissFollowupModal();
    final android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
    org.keynote.godtools.android.support.v4.fragment.GtFollowupModalDialogFragment.newInstance(mAppPackage, mAppLanguage, mPackageStatus, modal.getId()).show(fm.beginTransaction().addToBackStack(org.keynote.godtools.android.SnuffyPWActivity.TAG_FOLLOWUP_MODAL), org.keynote.godtools.android.SnuffyPWActivity.TAG_FOLLOWUP_MODAL);
}