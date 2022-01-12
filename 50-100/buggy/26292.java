@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_home);
    com.example.celien.drivemycar.models.User currentUser = ((com.example.celien.drivemycar.models.User) (getIntent().getParcelableExtra("user")));
    if (currentUser != null)
        this.user = currentUser;
    
    android.util.Log.d("Login Mail ", user.getEmail());
    android.util.Log.d("Login Bank ", user.getBankAccount());
    init();
}