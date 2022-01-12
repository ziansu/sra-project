@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if ((getResources().getConfiguration().orientation) == (android.content.res.Configuration.ORIENTATION_LANDSCAPE)) {
        finish();
        return ;
    }
    if (savedInstanceState == null) {
        nl.avans.mbd2_android.fragments.FragmentDetails details = new nl.avans.mbd2_android.fragments.FragmentDetails();
        details.setArguments(getIntent().getExtras());
        getFragmentManager().beginTransaction().add(android.R.id.content, details).commit();
    }
}