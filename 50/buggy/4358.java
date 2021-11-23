synchronized void unpin(simpledb.buffer.Buffer buff) {
    buff.unpin();
    java.lang.System.out.println(("Unpinned buffer:" + (buff.block().toString())));
    if (!(buff.isPinned()))
        (numAvailable)++;
    
}