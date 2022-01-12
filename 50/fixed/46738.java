@org.junit.After
public void closeApps() {
    org.apache.camel.util.IOHelper.close(app2, app);
}