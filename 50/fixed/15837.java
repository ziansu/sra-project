public void delete(java.lang.String key) {
    db.delete(bytes(key));
    logger.info(((("Node[" + (node.getHashcode())) + "] DELETE Key:") + key));
}