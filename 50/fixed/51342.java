@java.lang.Override
public void dispose() {
    super.dispose();
    Resources.Data.getData().writeDataToDisk();
    java.lang.System.exit(0);
}