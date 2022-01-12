@java.lang.Override
public void accept(com.google.gson.JsonObject object) throws java.lang.Exception {
    android.util.Log.d("login", "do on success");
    mBinding.loginLoading.showCustomLoading(false);
    mBinding.btnLogin.setEnabled(true);
    android.content.Intent intent = new android.content.Intent(getContext(), id.co.flipbox.mvvmstarter.views.activities.ViewPagerActivity.class);
    startActivity(intent);
    getActivity().finish();
}