@java.lang.Override
public void onClick(android.view.View view) {
    android.support.v4.app.FragmentTransaction transaction = fm.beginTransaction();
    com.hukx.webcollect.HandleBackFragment newFragment = new com.hukx.webcollect.NewFragment();
    currFrament = newFragment;
    transaction.replace(R.id.content_home, newFragment);
    transaction.addToBackStack("");
    transaction.commit();
    hideFloatingButton();
}