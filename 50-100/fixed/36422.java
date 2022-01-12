private boolean update(java.lang.String table, jp.hazuki.yuzubrowser.adblock.AdBlock adBlock) {
    boolean result;
    if ((adBlock.getId()) > (-1)) {
        result = _update(table, adBlock);
    }else {
        result = _add(table, adBlock);
    }
    updateListTime(table);
    return result;
}