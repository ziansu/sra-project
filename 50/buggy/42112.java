public void updatePitBenchData(int projectId) {
    loadRequiredFieldMapping(projectId);
    parsePitAndBenchData();
    updateDB(projectId);
}