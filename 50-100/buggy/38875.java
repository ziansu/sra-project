@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState, @android.support.annotation.Nullable
android.os.PersistableBundle persistentState) {
    super.onCreate(savedInstanceState, persistentState);
    if ((getFragmentManager().findFragmentById(android.R.id.content)) == null) {
        int position = getIntent().getIntExtra(com.commonsware.empublite.NoteActivity.EXTRA_POSITION, (-1));
        if (position >= 0) {
            android.app.Fragment f = com.commonsware.empublite.NoteFragment.newInstance(position);
            getFragmentManager().beginTransaction().add(android.R.id.content, f).commit();
        }
    }
}