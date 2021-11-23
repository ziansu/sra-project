private void updateHistorydateAndUI(java.lang.String historyTitle, java.lang.String historySubTitle, com.waynehfut.easyconnect.Connection.ConnectionStatus newconnect, com.waynehfut.easyconnect.EasyHistory easyConnectHistory) {
    easyConnectHistory.setHistoryTitle(historyTitle);
    easyConnectHistory.setHistorySubTitle(historySubTitle);
    easyConnectHistory.setHisType(newconnect);
    easyHistoryLab.addHistory(easyConnectHistory);
    historyAddCallback.onHistoryAdd();
}