public void onClick_Start(android.view.View view) {
    playerNumber = java.lang.Integer.parseInt(((java.lang.String) (spinner.getSelectedItem())));
    createCharacterList();
    java.lang.System.out.println(charecters.size());
    java.lang.System.out.println(playerNumber);
    android.content.Intent intent = new android.content.Intent(this, com.example.shoha.avalon.AddPlayers.class);
    intent.putParcelableArrayListExtra("charecters", charecters);
    intent.putExtra("Charecters", this.Charecters);
    intent.putExtra("playerNumber", this.playerNumber);
    startActivity(intent);
}