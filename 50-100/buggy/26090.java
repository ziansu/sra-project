@java.lang.Override
public int createMatch(com.cidic.sdx.dggl.model.Match match) {
    try {
        match.setCreatetime(new java.util.Date());
        for (com.cidic.sdx.dggl.model.Matchlist mListObj : match.getMatchlists()) {
            mListObj.setMatch(match);
        }
        matchDaoImpl.createMatch(match);
        return com.cidic.sdx.util.ResponseCodeUtil.MATCH_OPERATION_SUCCESS;
    } catch (java.lang.Exception e) {
        return com.cidic.sdx.util.ResponseCodeUtil.MATCH_OPERATION_FAILURE;
    }
}