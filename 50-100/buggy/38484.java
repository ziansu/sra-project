public void newGameButtonClicked(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, com.example.andware.tetravex.Classic.class);
    switch (gameType) {
        case 1 :
            java.lang.String time = cT.toString();
            intent.putExtra("key", 1);
            break;
        case 4 :
        default :
            mTimer.stop();
            break;
    }
    intent.putExtra("username", username);
    startActivity(intent);
    finish();
}