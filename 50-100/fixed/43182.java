@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (!(initBluetooth())) {
        return ;
    }
    setContentView(R.layout.activity_login);
    initTextViews();
    initLoginButton();
    activities.LoginActivity._errorMsg = "";
    activities.LoginActivity.treatmentUidTranslator = new logic.TreatmentsTable(this);
    activities.LoginActivity._instance = this;
}