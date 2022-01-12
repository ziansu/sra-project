public void continueGame(android.view.View view) {
    android.content.Intent intent = null;
    gl.nextGroup();
    if ((gl.getActiveGroup().getId()) == 0) {
        intent = new android.content.Intent(this, com.example.awesome.programmiernacht.roundFinished.class);
    }else {
        intent = new android.content.Intent(this, com.example.awesome.programmiernacht.groupReady.class);
    }
    startActivity(intent);
}