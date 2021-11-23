@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mSharedPrefsManager = cz.ejstn.gargantua.model.DefaultSharedPreferencesManager.getInstance(getContext());
}