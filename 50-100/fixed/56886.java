@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    org.md2k.study.model_view.user_info.UserInfoManager userInfoManager = ((org.md2k.study.model_view.user_info.UserInfoManager) (org.md2k.study.controller.ModelManager.getInstance(this).getModel(ModelFactory.MODEL_USER_INFO)));
    if (userInfoManager.isInDatabase) {
        android.widget.Toast.makeText(this, "UserID exists. To change it, clear all data...", Toast.LENGTH_LONG).show();
    }else
        showAlertDialog();
    
}