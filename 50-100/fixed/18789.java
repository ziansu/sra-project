private void binaryTrieGetValue(java.util.Map<java.lang.String, java.lang.String> dataMap, java.lang.String key) {
    com.tqmall.search.commons.algorithm.Node<java.lang.String> node = com.tqmall.search.commons.algorithm.TrieTest.binaryTrie.getNode(key);
    org.junit.Assert.assertNotNull(node);
    java.lang.String ret = node.getValue();
    org.junit.Assert.assertEquals(((("binaryTrieGetValue, key: " + key) + ", getValue = ") + ret), dataMap.get(key), ret);
}