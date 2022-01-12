public static void main(java.lang.String[] arg) {
    int N = 1;
    java.util.concurrent.ExecutorService pool = java.util.concurrent.Executors.newFixedThreadPool(1);
    for (int i = 0; i < N; i++) {
        java.lang.String str;
        if ((i & 1) == 1)
            str = "wmz";
        else
            str = "wmz0001";
        
        pool.submit(new Client(str));
    }
}