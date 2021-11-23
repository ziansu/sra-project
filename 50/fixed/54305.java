@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_status);
    com.hess.hessandroid.volley.VolleyRequest vr = new com.hess.hessandroid.volley.VolleyRequest();
    vr.postData(this, "", null);
    tv.setText("Testing.  Gogogo!");
}