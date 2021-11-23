public io.druid.indexing.common.task.AppendTask toAppendTask() {
    return new io.druid.indexing.common.task.AppendTask(getId(), getDataSource(), io.druid.indexing.common.task.AppendSimpleTask.getSegments(), null);
}