public java.util.Set<java.lang.String> scan(java.util.Queue<java.lang.String> queue) {
    java.util.Set<java.lang.String> set = new java.util.HashSet<>();
    while (!(queue.isEmpty())) {
        java.lang.String url = queue.poll();
        try {
            java.lang.String content = webClient.get(url);
            crawle(url, set, content);
        } catch (java.io.IOException e) {
        }
    } 
    return set;
}