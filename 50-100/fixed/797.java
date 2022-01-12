@java.lang.Override
public void map(water.rapids.Chunk[] cs, water.rapids.NewChunk[] ncs) {
    water.rapids.Chunk c = cs[0];
    for (int i = 0; i < (c._len); ++i) {
        if (!(c.isNA(i))) {
            int idx = ((int) (c.at8(i)));
            ncs[0].addNum(matchCounts[idx]);
        }else
            ncs[0].addNA();
        
    }
}