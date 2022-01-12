public void executeCommand(Model.Abilities.CommandsEnum command) {
    switch (command) {
        case make_transaction :
            java.lang.System.out.println("making transaction...");
            transaction();
            break;
        case up :
            up();
            break;
        case down :
            down();
            break;
        case left :
            left();
            break;
        case right :
            right();
            break;
        default :
            java.lang.System.out.println("Don't send that command to the TradeState");
    }
}