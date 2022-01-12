public com.algorithmia.algo.Algorithm setTimeout(java.lang.Long timeout, java.util.concurrent.TimeUnit unit) {
    java.lang.Long time = unit.convert(timeout, java.util.concurrent.TimeUnit.SECONDS);
    java.util.Map<java.lang.String, java.lang.String> optionsClone = new java.util.HashMap<java.lang.String, java.lang.String>(options);
    optionsClone.put(com.algorithmia.algo.Algorithm.AlgorithmOptions.TIMEOUT.toString(), time.toString());
    return new com.algorithmia.algo.Algorithm(client, algoRef, optionsClone);
}