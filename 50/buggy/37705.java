public int deleteByPrimaryKey(java.lang.String itemId) {
    itemMapper.removeForeignKey();
    itemMapper.deleteByPrimaryKey(itemId);
    itemMapper.addForeignKey();
    return 1;
}