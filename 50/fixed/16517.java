@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(this.getBaseContext(), com.snippet.snippet.view.UntaggedPhotosActivity.class);
    intent.putExtra(UntaggedPhotosActivity.pathsExtraKey, ((java.util.ArrayList<java.lang.String>) (paths)));
    startActivity(intent);
}