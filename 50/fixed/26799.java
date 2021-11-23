@java.lang.Override
public void clean() {
    if ((file) != null) {
        file.delete();
        file = null;
    }
}