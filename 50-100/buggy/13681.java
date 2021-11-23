@java.lang.Override
public void run() {
    super.run();
    if ((mongod) != null) {
        mongod.stop();
        mongodExe.stop();
    }
    db = null;
    client = null;
    mongod = null;
    mongodExe = null;
}