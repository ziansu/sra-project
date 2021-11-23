@org.junit.After
public void tearDown() {
    if ((context) != null) {
        context.close();
    }
}