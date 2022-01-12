public void count(int x) {
    if (x > 0) {
        for (int i = 1; i < x; i++) {
            if ((i % 2) == 1) {
                java.lang.System.out.println((i + "..."));
            }
        }
        if ((x % 2) == 1)
            java.lang.System.out.println((x + "!"));
        
    }
}