public void onContentAdd() {
    android.os.Bundle b = new android.os.Bundle();
    android.content.Intent i = new android.content.Intent(getActivity(), com.codementor.android.starwarsbattlefrontcommunity.NewContentActivity.class);
    b.putInt(com.codementor.android.starwarsbattlefrontcommunity.CommunityFragment.EXTRA_TOPIC_PAGE_POSITION, mTopicPage);
    b.putStringArrayList(com.codementor.android.starwarsbattlefrontcommunity.CommunityFragment.EXTRA_TOPIC_LIST, ((java.util.ArrayList<java.lang.String>) (mTopicTitles)));
    b.putBoolean(com.codementor.android.starwarsbattlefrontcommunity.CommunityFragment.EXTRA_CONTENT_TYPE_POST, true);
    i.putExtras(b);
    startActivityForResult(i, com.codementor.android.starwarsbattlefrontcommunity.CommunityFragment.REQUEST_CODE_POST);
}