private void update(java.lang.String table, jp.hazuki.yuzubrowser.adblock.AdBlock adBlock) {
    if ((adBlock.getId()) > (-1)) {
        _update(table, adBlock);
    }else {
        _add(table, adBlock);
    }
    updateListTime(table);
}