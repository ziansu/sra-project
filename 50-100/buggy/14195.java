@org.junit.Test
public void createNewGenerator_fail_if_the_item_set_is_null() throws java.lang.Exception {
    com.valulz.close.model.ItemSet items = new com.valulz.close.model.ItemSet(new com.valulz.close.model.Item("a"));
    com.valulz.close.model.Generator generator = new com.valulz.close.model.Generator(items, items);
    try {
        generator.createNewGenerator(null);
        org.assertj.core.api.Assertions.fail("createNewGenerator should have failed because of the null parameter");
    } catch (java.lang.IllegalArgumentException ignored) {
    }
}