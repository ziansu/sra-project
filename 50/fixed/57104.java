@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    signUpForm = ((com.example.michael.tddc73project.SignUpForm) (findViewById(R.id.SignUpForm)));
    signUpForm.addEditableText("Extra TextField");
}