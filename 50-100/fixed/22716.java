@org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.POSTING)
public void onMessageEvent(com.sndp.kunnathunadu.uniondatabank.greenrobot.events.ShowSakhaDetailsEvents event) {
    android.widget.Toast.makeText(this, ("Sakha: Activity " + (event.getSakhaName())), Toast.LENGTH_SHORT).show();
    com.sndp.kunnathunadu.uniondatabank.fragments.SakhaDetailsFragment fragment = com.sndp.kunnathunadu.uniondatabank.fragments.SakhaDetailsFragment.newInstance(event.getSakhaName());
    android.support.v4.app.FragmentManager manager = getSupportFragmentManager();
    manager.beginTransaction().add(R.id.content_main, fragment, com.sndp.kunnathunadu.uniondatabank.activites.MainActivity.SAKHA_DETAILS_FRAGMENT).addToBackStack(com.sndp.kunnathunadu.uniondatabank.activites.MainActivity.SAKHA_DETAILS_FRAGMENT).commit();
}