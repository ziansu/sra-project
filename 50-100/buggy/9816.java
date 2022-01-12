@java.lang.Override
public void onBackPressed() {
    java.lang.String displayedFragment = contactsModel.getProperty(io.craigmiller160.contacts5.util.ContactsConstants.DISPLAYED_FRAGMENT, java.lang.String.class);
    if ((displayedFragment != null) && (displayedFragment.equals(io.craigmiller160.contacts5.util.ContactsConstants.TABS_FRAGMENT_TAG))) {
        backAction();
    }else {
        finish();
    }
}