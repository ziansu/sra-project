@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent i = new android.content.Intent(getApplicationContext(), joshbennett.designproject.LevelActivity.class);
    i.setFlags(((i.getFlags()) | (android.content.Intent.FLAG_ACTIVITY_NO_HISTORY)));
    i.putExtra("levelNum", ((levelNum) + 1));
    i.putExtra("isTutorial", isTutorial);
    startActivity(i);
}