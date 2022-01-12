private java.lang.String put(java.lang.String key, java.lang.String value) {
    ru.spbau.mit.DictionaryImpl.DictionaryBucket.DictionaryNode node = find(key);
    if (node == null) {
        ru.spbau.mit.DictionaryImpl.DictionaryBucket.DictionaryNode newNode = new ru.spbau.mit.DictionaryImpl.DictionaryBucket.DictionaryNode(key, value);
        newNode.next = head;
        if ((head) != null) {
            head.prev = newNode;
        }
        head = newNode;
        (size)++;
        return null;
    }else {
        java.lang.String result = node.value;
        node.value = value;
        return result;
    }
}