@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    app = ((ie.wit.semester06_project.main.FinanceApp) (getApplication()));
    mFirebaseAnalytics = com.google.firebase.analytics.FirebaseAnalytics.getInstance(this);
    databaseReference = com.google.firebase.database.FirebaseDatabase.getInstance().getReference();
    if (!(FinanceApp.serviceFactory.getUtil().connectedToInternet())) {
        FinanceApp.serviceFactory.getUtil().makeAToast(this, "No internet access");
    }else {
        FinanceApp.serviceFactory.getUtil().makeAToast(this, "Internet access");
    }
}