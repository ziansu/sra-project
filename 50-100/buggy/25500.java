void beginWizardTransaction(org.sufficientlysecure.keychain.ui.base.WizardFragment fragment, boolean addToBackStack) {
    android.support.v4.app.FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
    if (addToBackStack) {
        transaction.addToBackStack(null);
    }
    transaction.setCustomAnimations(R.anim.frag_slide_in_from_right, R.anim.frag_slide_out_to_left, R.anim.frag_slide_in_from_left, R.anim.frag_slide_out_to_right);
    transaction.replace(R.id.unlockWizardFragmentContainer, fragment, org.sufficientlysecure.keychain.ui.CreateKeyWizardActivity.FRAGMENT_TAG);
    transaction.commit();
}