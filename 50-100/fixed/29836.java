@org.junit.Test
public void testResolveComplex() {
    java.util.Properties props = new java.util.Properties();
    props.setProperty("user.name", "joeblow");
    props.setProperty("user.dir", "/home/${user.name}/${none}/${temp.dir}/pdf");
    props.setProperty("temp.dir", "tmp");
    xpertss.util.Config config = new xpertss.util.Config(props).resolve();
    assertEquals("/home/joeblow/${none}/tmp/pdf", config.getProperty("user.dir"));
}