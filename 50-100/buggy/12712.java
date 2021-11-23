public static void signOut(android.content.Context context) {
    new com.example.tberroa.girodicerapp.data.OperatorInfo().clear(context);
    new com.example.tberroa.girodicerapp.data.CurrentInspectionInfo().clearAll(context);
    new com.example.tberroa.girodicerapp.data.UserInfo().setUserStatus(context, false);
    new com.example.tberroa.girodicerapp.database.LocalDB().clear();
    context.startActivity(new android.content.Intent(context, com.example.tberroa.girodicerapp.activities.SignInActivity.class));
    if (context instanceof android.app.Activity) {
        ((android.app.Activity) (context)).finish();
    }
}