public int clear() {
    size = 0;
    int count = 0;
    for (int i = 0; i < (uk.ac.imperial.lsds.streamsql.op.stateful.IntMap.INTMAP_CONTENT_SIZE); i++) {
        if ((content[i]) != null) {
            uk.ac.imperial.lsds.streamsql.op.stateful.IntMapEntry e = content[i];
            while (e != null) {
                uk.ac.imperial.lsds.streamsql.op.stateful.IntMapEntry f = e.next;
                e.release();
                count++;
                e = f;
            } 
            content[i] = null;
        }
    }
    return count;
}