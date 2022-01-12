private void process(backtype.storm.tuple.Tuple t) {
    (counter)++;
    java.util.List<backtype.storm.tuple.Values> result = f.process(t);
    if (result != null)
        for (backtype.storm.tuple.Values out : result) {
            emit(t, out);
            if (keepStats) {
                countStat.increase(1);
            }
        }
    
}