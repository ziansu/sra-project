@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.d("isTutVisible", java.lang.String.valueOf(com.bedrock.padder.activity.MainActivity.isTutorialVisible));
    if ((com.bedrock.padder.activity.MainActivity.isTutorialVisible) == false) {
        toggleTutorial();
        com.bedrock.padder.activity.MainActivity.isTutorialVisible = true;
    }
}