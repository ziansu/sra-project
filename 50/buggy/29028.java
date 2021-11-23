public java.util.List<askme.SolutionEntity> getSolutionList(int classId, int exerciseId, int solutionId) {
    solutionList = solutionSessionBean.getSolutions();
    return solutionList;
}