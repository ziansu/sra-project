@org.junit.After
public void close() {
    if ((this.context) != null) {
        this.context.close();
    }
}