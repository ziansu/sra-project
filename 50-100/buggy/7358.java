@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    rustelefonen.no.drikkevett_android.information.DBSeeder.seed(this);
    android.content.Intent intent;
    if (hasUser())
        intent = new android.content.Intent(this, rustelefonen.no.drikkevett_android.MainActivity.class);
    else
        intent = new android.content.Intent(this, rustelefonen.no.drikkevett_android.intro.WelcomeActivity.class);
    
    startActivity(intent);
    finish();
}