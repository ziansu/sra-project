@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_user);
    findViewById(R.id.favorites).setOnClickListener(this);
    findViewById(R.id.main).setOnClickListener(this);
    findViewById(R.id.user).setOnClickListener(this);
    findViewById(R.id.sign_out_button).setOnClickListener(this);
    android.widget.TextView currentClass = ((android.widget.TextView) (findViewById(R.id.currentclass)));
    currentClass.setText(this.getClass().getSimpleName());
    configSignInBuildClient();
}