@java.lang.Override
public void onSucess(java.lang.Class view) {
    android.content.Intent intent = new android.content.Intent(this, view);
    intent.putExtra(museum.findit.com.myapplication.view.Activities.LoginActivity.EXTRA_MESSAGE_USERNAME, name);
    startActivity(intent);
}