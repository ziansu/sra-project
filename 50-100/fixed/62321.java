private void setTextMessageOfAlertDialog(java.lang.String message) {
    switch (message) {
        case "WIN!" :
            setTextWinner();
            break;
        case "LOSE!" :
            setTextLoser();
            break;
        case "logout" :
            setTextLogout();
            break;
        case "Give Up" :
            setTextGiveUp();
            break;
    }
}