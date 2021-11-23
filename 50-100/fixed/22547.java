@java.lang.Override
public void varInit() {
    refreshing = false;
    shoeList = new java.util.ArrayList<>();
    triggerAction = new wale_tech.tryon.trigger.TriggerAction(this);
    int result = triggerAction.getList(BaseAction.REQUEST_DEFAULT, trigger.getResult(), trigger.getPath(), trigger.getWorkSpace(), true, false);
    if (result == (wale_tech.tryon.base.BaseAction.ACTION_LACK)) {
        android.content.Intent login_int = new android.content.Intent(this, wale_tech.tryon.login.Login_Act.class);
        login_int.setAction("GetSkuCodeAction");
        startActivity(login_int);
        finish();
    }
}