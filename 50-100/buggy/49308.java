public void executeCommand(Model.Abilities.CommandsEnum command) {
    switch (command) {
        case make_transaction :
            java.lang.System.out.println("making transaction...");
            transaction();
            break;
        case up :
            up();
        case down :
            down();
        case left :
            left();
        case right :
            right();
        default :
            java.lang.System.out.println("Don't send that command to the TradeState");
    }
}