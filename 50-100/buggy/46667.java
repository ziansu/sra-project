@com.restfb.JsonMapper.JsonMappingCompleted
private void fillTotalCount() {
    if ((((totalCount) == 0) && ((summary) != null)) && ((summary.get("total_count")) != null)) {
        totalCount = summary.getLong("total_count", totalCount);
    }
}