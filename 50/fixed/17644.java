@java.lang.Override
public void onAttach(android.content.Context context) {
    super.onAttach(context);
    actionBar = ((android.support.v7.app.AppCompatActivity) (context)).getSupportActionBar();
    if ((actionBar) != null) {
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
}