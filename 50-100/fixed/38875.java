@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if ((getFragmentManager().findFragmentById(android.R.id.content)) == null) {
        int position = getIntent().getIntExtra(com.commonsware.empublite.NoteActivity.EXTRA_POSITION, (-1));
        if (position >= 0) {
            android.app.Fragment f = com.commonsware.empublite.NoteFragment.newInstance(position);
            getFragmentManager().beginTransaction().add(android.R.id.content, f).commit();
        }
    }
}