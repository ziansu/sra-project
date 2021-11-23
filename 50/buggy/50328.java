@java.lang.Override
public void delete() {
    dispose();
    if (fFile.exists()) {
        fFile.delete();
    }
}