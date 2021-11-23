@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    android.util.Log.e(com.useeinfo.testgitoperation.MainActivity.TAG, "onCreate: 11111111");
    com.useeinfo.testgitoperation.UserModel userModel = new com.useeinfo.testgitoperation.UserModel();
    userModel.setName("leo");
    android.widget.TextView tv = null;
    tv.setText(userModel.getName());
    android.util.Log.e(com.useeinfo.testgitoperation.MainActivity.TAG, "onCreate: 22222222");
}