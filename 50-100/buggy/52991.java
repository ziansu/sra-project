@org.junit.Test
public void testExecute() {
    java.lang.String location = "toronto";
    java.lang.String limit = "10";
    java.lang.String lat = "43.648742";
    java.lang.String lon = "-79.387199";
    java.lang.String[] params = new java.lang.String[]{ location , limit , lat , lon };
    android.os.AsyncTask<java.lang.String, java.lang.Object, java.util.List<com.yelprestaurantapp.bean.Restaurant>> task = fixture.execute(params);
    org.junit.Assert.assertNotNull(asyncResult);
}