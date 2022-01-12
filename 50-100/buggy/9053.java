@java.lang.Override
public void map(water.util.Chunk c) {
    for (int i = 0; i < (c._len); ++i) {
        if (c.isNA(i))
            continue;
        else
            c.set(i, fromTo[((int) (c.at8(i)))]);
        
    }
}