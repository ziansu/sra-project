public static java.lang.String[] searchArgs(java.lang.String query) {
    return new java.lang.String[]{ java.lang.Integer.toString(de.digisocken.anotherrss.FeedContract.Flag.VISIBLE) , ("%" + query) + "%" , ("%" + query) + "%" , ("%" + query) + "%" };
}