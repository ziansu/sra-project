private static com.hit.algorithm.IAlgoCache<java.lang.Long, java.lang.Long> ConvertToAlgo(java.lang.String algoString, java.lang.Integer capacity) {
    com.hit.algorithm.IAlgoCache<java.lang.Long, java.lang.Long> algo = null;
    switch (algoString) {
        case "LRU" :
            {
                algo = new com.hit.algorithm.LRUAlgoCacheImpl(capacity);
                break;
            }
        case "NFU" :
            {
                algo = new com.hit.algorithm.NFUAlgoCacheImpl(capacity);
                break;
            }
        case "RANDOM" :
            {
                algo = new com.hit.algorithm.RandomAlgoCacheImpl(capacity);
                break;
            }
    }
    return algo;
}