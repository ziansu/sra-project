public void onSucess(java.lang.Class view) {
    android.content.Intent intent = new android.content.Intent(this, view);
    intent.putExtra(museum.findit.com.myapplication.view.Activities.JoinGameActivity.EXTRA_MESSAGE_USERNAME, username);
    intent.putExtra(museum.findit.com.myapplication.view.Activities.JoinGameActivity.EXTRA_MESSAGE_GAMECODE, gameCode);
    startActivity(intent);
}