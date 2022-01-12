public synchronized java.lang.Long zrank(com.fiftyonred.mock_jedis.DataContainer key, com.fiftyonred.mock_jedis.DataContainer member) {
    long rank = 0;
    java.util.TreeSet<com.fiftyonred.mock_jedis.DataContainer> set = getSortedSetFromStorage(key, true);
    for (com.fiftyonred.mock_jedis.DataContainer item : set) {
        if (item.equals(member)) {
            return rank;
        }
        rank++;
    }
    return -1L;
}