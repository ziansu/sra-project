@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    ((android.support.v7.app.AppCompatActivity) (getActivity())).getSupportActionBar().hide();
    context = getContext();
    preferenceManager = new com.aadamsdev.communities.utils.PreferenceManager(getContext());
}