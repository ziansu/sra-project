private void query() {
    main.java.mmas.serenderp.util.SparseVector queryPoint;
    for (java.lang.String movieName : main.test.mmas.serenderp.util.QueryTest.movieNames) {
        queryPoint = main.test.mmas.serenderp.util.QueryTest.allMovies.get(movieName);
        if (queryPoint == null) {
            java.lang.System.out.println(movieName);
            continue;
        }
        org.junit.Assert.assertNotNull(queryPoint);
    }
    java.lang.System.out.println();
}