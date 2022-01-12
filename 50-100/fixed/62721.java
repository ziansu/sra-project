private java.lang.String getRandomUrl(java.util.Set<java.lang.String> urls) {
    java.util.Random randomGenerator = new java.util.Random();
    int randomNumber = randomGenerator.nextInt(urls.size());
    return ((java.lang.String) (urls.toArray()[randomNumber]));
}