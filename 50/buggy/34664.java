private void tryLoadingNextContact() {
    if ((mActiveContactIndex) == ((mIssue.contacts.length) - 1)) {
        returnToMain();
    }else {
        (mActiveContactIndex)++;
        setupContactUi(mActiveContactIndex);
    }
}