@java.lang.Override
public void onClick(android.view.View v) {
    com.juntcompany.godandgod.Login.SignIn.SignInPolicyFragment f = new com.juntcompany.godandgod.Login.SignIn.SignInPolicyFragment();
    SignInActivity.fNum = getActivity().getSupportFragmentManager().getBackStackEntryCount();
    android.support.v4.app.FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
    ft.replace(R.id.container, f);
    ft.addToBackStack(("" + (SignInActivity.fNum)));
    android.widget.Toast.makeText(getContext(), java.lang.String.valueOf(SignInActivity.fNum), Toast.LENGTH_SHORT).show();
    ft.commit();
}