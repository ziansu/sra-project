@butterknife.OnClick(value = R.id.baby_pic)
public void setBabyPicImageViewClicked() {
    com.rorlig.babylog.ui.fragment.profile.PictureSourceSelectFragment pictureSourceSelectFragment = new com.rorlig.babylog.ui.fragment.profile.PictureSourceSelectFragment();
    pictureSourceSelectFragment.show(getActivity().getSupportFragmentManager(), "picture_select_fragment");
}