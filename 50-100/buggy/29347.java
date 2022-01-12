private void LongToShort(Request request) {
    int id = ShortenEngine.atomicInteger.incrementAndGet();
    java.lang.String shortURL = getShortURL(id);
    jedis.set(request.getContent(), shortURL);
    request.getCallback().responesString(shortURL);
}