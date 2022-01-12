private void setTextMessageOfAlertDialog(java.lang.String message) {
    switch (message) {
        case "WIN!" :
            setTextWinner();
            playAgainMessage();
            break;
        case "LOSE!" :
            setTextLoser();
            playAgainMessage();
            break;
        case "logout" :
            setTextLogout();
            break;
        case "Give Up" :
            setTextGiveUp();
            break;
    }
}