private void startRegisterActivity() {
    parepare.cotery.com.cotery.login.register.RegisterFragment registerFragment = new parepare.cotery.com.cotery.login.register.RegisterFragment();
    getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.login_main, registerFragment, "registerFragment").addToBackStack(null).commit();
}