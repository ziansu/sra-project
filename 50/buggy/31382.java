private void updateClientsButtonUnreadCount() {
    if (((mClientsButton) != null) && ((mJobRequestsCount) != null)) {
        mClientsButton.setUnreadCount(mJobRequestsCount);
    }
}