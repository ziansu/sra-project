public boolean isFolder() {
    return ((localCopy) != null) || (((type) != null) && (type.toLowerCase().startsWith(com.google.cloud.genomics.dockerflow.task.TaskDefn.Param.TYPE_FOLDER)));
}