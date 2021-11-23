private int findFirstBlockIndex(org.netpreserve.commons.cdx.SearchKey key) {
    for (int i = 0; i < (blocks.length); i++) {
        if (!(key.isBefore(blocks[i].key))) {
            if (i == 0) {
                return 0;
            }else {
                return i - 1;
            }
        }
    }
    return (blocks.length) - 1;
}