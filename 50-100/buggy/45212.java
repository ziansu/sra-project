@java.lang.Override
public void onClick(android.view.View v) {
    android.support.v4.app.Fragment fragment = getSupportFragmentManager().findFragmentByTag(getString(R.string.create_ticket));
    if (fragment == null)
        fragment = new co.helpdesk.faveo.frontend.fragments.CreateTicket();
    
    android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
    android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    fragmentTransaction.replace(R.id.container_body, fragment, title);
    fragmentTransaction.addToBackStack(null);
    fragmentTransaction.commit();
}