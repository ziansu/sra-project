@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    activity.startActivity(new android.content.Intent(activity, tda367.myapplication.controller.ActivityInfo.class));
    learnJava.setCurrentLevel(((learnJava.getCurrentLevel()) + 1));
}