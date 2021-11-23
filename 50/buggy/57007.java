public java.util.Map<java.lang.String, java.lang.Object> queryTaskListByTeacherId(int pTeacherId, java.lang.String pFilter, int pStatus, com.fmc.edu.util.pagenation.Pagination pPagination) {
    return getTaskRepository().queryTaskListByTeacherId(pTeacherId, pFilter, pStatus, pPagination);
}