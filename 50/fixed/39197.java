private void validateParties() {
    switch (parker.serb.Global.activeSection) {
        case "ULP" :
            validateULPParties();
            break;
        case "REP" :
            validateREPParties();
            break;
    }
}