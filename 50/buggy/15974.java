@java.lang.Override
public void onStart() {
    super.onStart();
    updateParameterItem();
    ((android.support.v7.app.AppCompatActivity) (getActivity())).getSupportActionBar().setTitle(parameterItem.name);
}