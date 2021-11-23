public void AddSubjectData(java.lang.String Subject_Number, java.util.ArrayList<java.lang.Long> LevelsAvg, java.util.ArrayList<java.lang.Long> LevelsCriterion) {
    AddLineToFile(TetrisCode.TimeInLevelData.FileName, Subject_Number, LevelsAvg, LevelsCriterion);
}