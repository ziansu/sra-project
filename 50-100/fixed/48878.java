@java.lang.Override
public void onRequestNextPage() {
    final int FIRST_POST = 0;
    if ((com.sonicmax.etiapp.fragments.MessageListFragment.nextPageUrl) != null) {
        mMessageListAdapter.clearMessages();
        loadMessageList(buildArgsForLoader(com.sonicmax.etiapp.fragments.MessageListFragment.nextPageUrl, false), LOAD_MESSAGE);
        com.sonicmax.etiapp.utilities.Toaster.makeToast(getContext(), ("Page " + (com.sonicmax.etiapp.fragments.MessageListFragment.currentPage)));
        scrollToPosition(FIRST_POST);
    }
}