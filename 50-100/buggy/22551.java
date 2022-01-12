@java.lang.Override
public java.util.List<FV> suggestCandidates(int count) {
    if ((ranking) == null)
        calculateRanking(count);
    
    java.util.List<FV> fvs = new java.util.ArrayList<>();
    for (int i = 0; i < (ranking.size()); i++)
        fvs.add(i, ranking.get(i).getValue());
    
    return fvs;
}