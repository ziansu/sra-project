private void nameRanking(java.lang.String givenName) {
    if (!("燕婉".equals(givenName)))
        return ;
    
    ltf.namerank.lab.RankItem item = new ltf.namerank.lab.RankItem(givenName);
    ranker.rank(item);
    rankItems.add(item);
}