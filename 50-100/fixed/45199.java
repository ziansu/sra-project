private <T> boolean tryAdd(com.google.common.collect.ConcurrentHashMultiset<T> multiset, T value, int max) {
    while (true) {
        int count = multiset.count(value);
        if ((count >= max) && (max != 0))
            return false;
        
        if (multiset.setCount(value, count, (count + 1)))
            return true;
        
    } 
}