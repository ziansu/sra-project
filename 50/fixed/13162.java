private void initData() {
    if ((tv_set_name) != null) {
        tv_set_name.setText(cn.bmob.im.BmobUserManager.getInstance(getActivity()).getCurrentUser().getUsername());
    }
}