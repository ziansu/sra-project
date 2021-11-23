private void initData() {
    tv_set_name.setText(cn.bmob.im.BmobUserManager.getInstance(getActivity()).getCurrentUser().getUsername());
}