@java.lang.Override
public int createMatch(com.cidic.sdx.dggl.model.Match match) {
    try {
        match.setCreatetime(new java.util.Date());
        for (com.cidic.sdx.dggl.model.Matchlist mListObj : match.getMatchlists()) {
            mListObj.setMatch(match);
        }
        return matchDaoImpl.createMatch(match);
    } catch (java.lang.Exception e) {
        return com.cidic.sdx.util.ResponseCodeUtil.MATCH_OPERATION_FAILURE;
    }
}