@java.lang.Override
public java.util.List<com.alibaba.fastjson.JSONObject> getJobInfoList(int taskId) {
    java.lang.String key = com.cszjo.jobhunter.model.RedisPrefix.getRedisJobInfoName(taskId);
    java.util.List<java.lang.String> lists = jedisUtils.getList(key);
    java.util.List<com.alibaba.fastjson.JSONObject> jobInfos = com.google.common.collect.Lists.newArrayList();
    for (int i = 0; i < (lists.size()); i++) {
        jobInfos.add(com.alibaba.fastjson.JSONObject.parseObject(lists.get(i)));
    }
    return jobInfos;
}