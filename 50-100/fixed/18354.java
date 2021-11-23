public void setTaskTags(cn.longhaiyan.task.domain.TaskInfo taskInfo) {
    if (taskInfo == null) {
        return ;
    }
    java.util.List<cn.longhaiyan.task.domain.TaskTag> taskTags = taskTagService.findByTaskId(taskInfo.getId());
    if (cn.longhaiyan.common.utils.CollectionUtil.isEmpty(taskTags)) {
        return ;
    }
    java.util.List<cn.longhaiyan.tag.domain.TagInfo> tagInfoList = new java.util.ArrayList<>();
    for (cn.longhaiyan.task.domain.TaskTag taskTag : taskTags) {
        cn.longhaiyan.tag.domain.TagInfo tagInfo = tagInfoService.findById(taskTag.getTagId());
        tagInfoList.add(tagInfo);
    }
    taskInfo.setTags(tagInfoList);
}