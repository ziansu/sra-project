private void query() {
    main.java.mmas.serenderp.util.SparseVector queryPoint;
    for (java.lang.String movieName : main.test.mmas.serenderp.util.QueryTest.movieNames) {
        queryPoint = main.test.mmas.serenderp.util.QueryTest.allMovies.get(movieName);
        if (queryPoint == null) {
            java.lang.System.out.println(movieName);
            continue;
        }
        org.junit.Assert.assertNotNull(queryPoint);
        main.java.mmas.serenderp.Engine.queryMemory(main.test.mmas.serenderp.util.QueryTest.c, main.test.mmas.serenderp.util.QueryTest.r, main.test.mmas.serenderp.util.QueryTest.w, queryPoint, main.test.mmas.serenderp.util.QueryTest.serendipitousMoviesToFind);
    }
    java.lang.System.out.println();
}