@org.junit.Test
public void test() throws java.lang.Exception {
    org.woodylab.boot.pebble.web.PebbleView view = new org.woodylab.boot.pebble.web.PebbleView(new com.mitchellbosecke.pebble.PebbleEngine.Builder().loader(new com.mitchellbosecke.pebble.loader.StringLoader()).build().getTemplate("Hello {{msg}}"));
    view.setApplicationContext(context);
    view.render(java.util.Collections.singletonMap("msg", "World"), request, response);
    org.junit.Assert.assertEquals("Hello World", response.getContentAsString());
}