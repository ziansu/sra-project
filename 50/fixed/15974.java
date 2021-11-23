@java.lang.Override
public void onStart() {
    super.onStart();
    updateParameterItem();
    if ((parameterItem) != null) {
        ((android.support.v7.app.AppCompatActivity) (getActivity())).getSupportActionBar().setTitle(parameterItem.name);
    }
}