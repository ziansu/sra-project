@butterknife.OnClick(value = R.id.profile_logout_button)
public void onLogoutSuccess() {
    profilePresenter.logout();
    getActivity().finish();
}