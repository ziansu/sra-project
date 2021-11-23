@java.lang.Override
public void close() {
    try {
        this.provider.closeWorkBook();
        this.data = null;
        this.provider = null;
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}