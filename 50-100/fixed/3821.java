private java.util.List<java.lang.String> httpRequest(java.lang.String url) throws java.io.IOException {
    java.net.HttpURLConnection httpc = ((java.net.HttpURLConnection) (new java.net.URL(url).openConnection()));
    try (java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(httpc.getInputStream(), java.nio.charset.StandardCharsets.UTF_8))) {
        return in.lines().collect(java.util.stream.Collectors.toList());
    }
}