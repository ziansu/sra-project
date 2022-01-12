@java.lang.Override
public void delete() {
    dispose(true);
    if (fFile.exists()) {
        fFile.delete();
    }
}