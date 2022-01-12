public static void closeCloseable(java.io.Closeable toBeClosed) {
    if (toBeClosed != null) {
        try {
            toBeClosed.close();
        } catch (java.io.IOException e) {
            java.lang.System.out.println(toBeClosed.getClass());
            e.printStackTrace();
        }
    }
}