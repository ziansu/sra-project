private void loadFriends() {
    if (((mMyApplication.Friends_Cach) != null) && ((mMyApplication.Friends_Cach.size()) > 0)) {
        processFinish(mMyApplication.Friends_Cach);
    }else {
        com.seniorproject.sallemapp.helpers.LoadFriendsAsync loadFrinds = new com.seniorproject.sallemapp.helpers.LoadFriendsAsync(getActivity().getApplicationContext(), DomainUser.CURRENT_USER.getId());
        loadFrinds.delegat = this;
        loadFrinds.execute();
        mProgress.setVisibility(View.VISIBLE);
    }
}