private void validateParties() {
    switch (parker.serb.Global.activeSection) {
        case "ULP" :
            validateULPParties();
        case "REP" :
            validateREPParties();
    }
}