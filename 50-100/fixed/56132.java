@java.lang.Override
public void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    login = getArguments().getString(com.globant.practice.presentation.view.fragment.SubscriberDetailsFragment.LOGIN_KEY);
    if (!(login.isEmpty())) {
        ((android.support.v7.app.AppCompatActivity) (getActivity())).getSupportActionBar().setTitle(login);
    }
}