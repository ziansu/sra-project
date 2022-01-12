public static risk.RiskBoard newBoard(java.lang.String fileName) {
    return risk.JSONBoardImport.createBoard(fileName, true);
}