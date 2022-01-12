public static <T> T getRandomElement(final java.util.List<T> list) {
    if (com.ajah.util.CollectionUtils.isEmpty(list)) {
        return null;
    }
    return list.get(com.ajah.util.RandomUtils.getRandomNumber(0, list.size()));
}