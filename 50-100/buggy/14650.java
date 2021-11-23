public static boolean checkLoginAndRedirect(android.app.Activity activity) {
    android.content.Context context = activity.getApplicationContext();
    if ((com.imaginabit.yonodesperdicion.AppSession.getCurrentUser()) == null) {
        android.util.Log.d(com.imaginabit.yonodesperdicion.utils.Utils.TAG, "checkLoginAndRedirect: go to login activity");
        android.content.Intent loginPanelIntent = new android.content.Intent(context, com.imaginabit.yonodesperdicion.activities.LoginPanelActivity.class);
        loginPanelIntent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        activity.startActivity(loginPanelIntent);
        return false;
    }else {
        return true;
    }
}