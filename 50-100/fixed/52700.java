private void loadFriendQuizzes() {
    int len = com.example.nightingale.qwalk.Model.Account.getInstance().getFriendIDs().size();
    if (len > 0) {
        for (int i = 0; i < len; i++) {
            loadOnlineQuizzes(com.example.nightingale.qwalk.Model.Account.getInstance().getFriendIDs().get(i), friendQuizzes);
            offset = 0;
        }
    }
}