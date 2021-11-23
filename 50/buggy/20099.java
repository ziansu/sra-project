@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent homeIntent = new android.content.Intent(android.content.Intent.ACTION_MAIN);
    homeIntent.addCategory(Intent.CATEGORY_HOME);
    homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    getContext().startActivity(homeIntent);
}