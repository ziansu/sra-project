@java.lang.Override
public java.util.List<edu.neumont.projectFiles.services.GameScoreModel> getAllGamesScores() {
    java.util.List<edu.neumont.projectFiles.services.GameScoreModel> allGameScores = gameScores.entrySet().stream().map(java.util.Map.Entry::getValue).collect(java.util.stream.Collectors.toList());
    return allGameScores;
}