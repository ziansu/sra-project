public void backTrace(java.lang.String seq, java.lang.String query, com.bio.pojo.AffineResult affineResult) {
    java.lang.StringBuffer seqStr = new java.lang.StringBuffer();
    java.lang.StringBuffer queryStr = new java.lang.StringBuffer();
    trace(query.toCharArray(), seq.toCharArray(), affineResult.getTable(), affineResult.getiIndex(), affineResult.getjIndex(), seqStr, queryStr);
    affineResult.setSeqStr(org.apache.commons.lang3.StringUtils.reverse(seqStr.toString()));
    affineResult.setQueryStr(org.apache.commons.lang3.StringUtils.reverse(queryStr.toString()));
}