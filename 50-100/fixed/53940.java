@java.lang.Override
public void onClick(android.view.View v) {
    android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
    android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    jajodia.aditya.com.bunkmanager2.ButtonFragment fragment = new jajodia.aditya.com.bunkmanager2.ButtonFragment();
    fragment.setSubject(subjects[finalI]);
    fragmentTransaction.replace(R.id.frame_layout, fragment, null);
    fragmentTransaction.commit();
}