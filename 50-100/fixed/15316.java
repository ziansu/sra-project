@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    newUserId = ulc.createUser(userNameET.getText().toString());
    ca.ualberta.cs.scandaloutraveltracker.UserController uc = new ca.ualberta.cs.scandaloutraveltracker.UserController(new ca.ualberta.cs.scandaloutraveltracker.User(newUserId));
    ulc.addUser(new ca.ualberta.cs.scandaloutraveltracker.User(newUserId));
    update();
}