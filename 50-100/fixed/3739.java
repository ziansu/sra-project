@org.junit.Test
public void getFromCluster() throws java.lang.Exception {
    gr.ru.dao.User[] clusters = hashMapDB.getFromCluster(8, 10, 3, 4);
    org.junit.Assert.assertEquals(gr.ru.gutil.SETUP_POINTS_IN_VIEW, clusters.length);
    clusters = hashMapDB.getFromCluster(14, 37, 11, 33);
    org.junit.Assert.assertTrue((((clusters.length) > 1) && ((clusters.length) <= (gr.ru.gutil.SETUP_POINTS_IN_VIEW))));
}