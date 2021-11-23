public void log(java.lang.String message) {
    Gdx.app.log(com.google.collinsmith70.diablo.Console.TAG, message);
    OUTPUT_STREAM.println(message);
}