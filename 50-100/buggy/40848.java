int getGujiLineHeight() {
    if (!(isGuji()))
        return 0;
    
    int gujiLeftBanWidth = ((getTextAreaHeight()) - (getGujiBanxinWidth())) / 2;
    int gujiLineNum = gujiLeftBanWidth / (getGujiBanxinWidth());
    return gujiLineNum == 0 ? gujiLeftBanWidth : gujiLeftBanWidth / gujiLineNum;
}