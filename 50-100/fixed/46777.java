public static org.wordpress.android.ui.people.PersonDetailFragment newInstance(long personID, int localTableBlogID) {
    org.wordpress.android.ui.people.PersonDetailFragment personDetailFragment = new org.wordpress.android.ui.people.PersonDetailFragment();
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putLong(org.wordpress.android.ui.people.PersonDetailFragment.ARG_PERSON_ID, personID);
    bundle.putInt(org.wordpress.android.ui.people.PersonDetailFragment.ARG_LOCAL_TABLE_BLOG_ID, localTableBlogID);
    personDetailFragment.setArguments(bundle);
    return personDetailFragment;
}