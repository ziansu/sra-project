private void showFragment(int position) {
    if ((currentUser) != null) {
        showFragment(position, currentUser.id);
    }else {
        showFragment(position, (-1));
    }
}