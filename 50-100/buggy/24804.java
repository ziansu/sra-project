public com.hust.mining.model.ResultWithBLOBs getResultWithBLOBsById(java.lang.String resultId, java.lang.String issueId) {
    com.hust.mining.model.ResultExample example = new com.hust.mining.model.ResultExample();
    com.hust.mining.model.ResultExample.Criteria cri = example.createCriteria();
    cri.andRidEqualTo(resultId);
    cri.andIssueIdEqualTo(issueId);
    java.util.List<com.hust.mining.model.ResultWithBLOBs> list = resultMapper.selectByExampleWithBLOBs(example);
    if ((null == list) || ((list.size()) > 0)) {
        return null;
    }
    return list.get(0);
}