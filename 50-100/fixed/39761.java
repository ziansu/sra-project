@android.annotation.TargetApi(value = Build.VERSION_CODES.LOLLIPOP)
@java.lang.Override
public void onClick(android.view.View v) {
    android.support.v4.app.FragmentManager mFragmentManager = getActivity().getSupportFragmentManager();
    android.support.v4.app.FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
    fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
    fragmentTransaction.replace(R.id.containerView, new com.example.lanmai.money.fragment.InputExpenseFragment());
    fragmentTransaction.addToBackStack("HomeDefaultFragment");
    fragmentTransaction.commit();
}