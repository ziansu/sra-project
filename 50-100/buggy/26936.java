public void joinGame(android.view.View view) {
    if (!(game)) {
        android.content.Intent intent = new android.content.Intent(this, no.ntnu.tdt4240.a18.battlingships.view.JoinGameView.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }else {
        android.content.Intent intent = new android.content.Intent(this, no.ntnu.tdt4240.a18.battlingships.view.CreateNewGame.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }
}