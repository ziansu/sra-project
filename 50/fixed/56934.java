@java.lang.Override
public void onClick(android.view.View v) {
    int idx = v.getId();
    name.mjs001.expensereport.User u2 = gc.getUserList().get(idx);
    gc.setCurUser(u2.getId());
}