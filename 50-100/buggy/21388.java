private void setupRecyclerView(android.support.v7.widget.RecyclerView recyclerView) {
    java.util.ArrayList<com.threemoji.threemoji.ChatListFragment.ChatItem> chats = new java.util.ArrayList<com.threemoji.threemoji.ChatListFragment.ChatItem>();
    addDummyData(chats);
    recyclerView.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(recyclerView.getContext()));
    recyclerView.setAdapter(new com.threemoji.threemoji.ChatListFragment.RecyclerViewAdapter(chats));
}