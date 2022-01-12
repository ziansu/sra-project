public java.util.Map<java.lang.Integer, java.lang.Integer> getCompositeRankMapByBookIdFromRedis(java.util.List<java.lang.Integer> bookIds) {
    java.util.Map<java.lang.Integer, java.lang.Integer> map = new java.util.HashMap<>();
    for (java.lang.Integer bookId : bookIds) {
        java.lang.Long crank = redisClientService.reverseZrank(BookRankEnums.composite.getCacheKey(), bookId.toString());
        if (crank > 0) {
            map.put(bookId, crank.intValue());
        }
    }
    return map;
}