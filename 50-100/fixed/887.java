@org.junit.Test
public void setMetaInformation() {
    java.util.List<java.lang.String> list = new java.util.ArrayList<java.lang.String>();
    list.add("test1");
    list.add("test2");
    extendedIngredientModel.setMetaInformation(list);
    org.junit.Assert.assertEquals(extendedIngredientModel.getMetaInformation(), list);
}