@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... params) {
    java.lang.String directory = pathFiles[itemPosition].getPath();
    try {
        executeRemoteCommand("admin", "admin", "10.1.25.2", 22);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    commander.println("ls");
    commander.println((("put " + directory) + " /home/lvuser"));
    return null;
}