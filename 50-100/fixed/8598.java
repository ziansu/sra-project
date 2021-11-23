public void botJailTurn() {
    if ((getCash()) >= 50) {
        if ((_jailTurns) >= 3) {
            _jailTurns = 0;
            _inJail = false;
            charge(50);
        }else
            _jailTurns += 1;
        
    }else {
        if ((_jailTurns) >= 3) {
            autoMortgage(50);
            charge(50);
        }else
            _jailTurns += 1;
        
    }
}