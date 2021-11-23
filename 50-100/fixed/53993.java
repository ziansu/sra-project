private void startAsyncTask(java.lang.String color, java.lang.String data) {
    android.util.Log.d(com.example.anna.colorgame.TrafficGame.TAG, ("Create task.TrafficGame " + color));
    com.example.anna.colorgame.ConnectToServer runner = new com.example.anna.colorgame.ConnectToServer(player.getChoosenIP(), delegate);
    java.lang.System.gc();
    android.util.Log.d(com.example.anna.colorgame.TrafficGame.TAG, ("Execute task.TrafficGame " + color));
    runner.execute(data);
    java.lang.System.gc();
}