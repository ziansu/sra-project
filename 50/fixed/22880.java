public java.lang.String getCrimeScene() {
    java.lang.Object[] options = game.allRoomNames().toArray();
    return view.guessDialog("Choose a room", "Scene of the crime?", options);
}