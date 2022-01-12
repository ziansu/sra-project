public static void main(java.lang.String[] args) {
    com.sangupta.expense.ExpenseMain main = io.airlift.airline.SingleCommand.singleCommand(com.sangupta.expense.ExpenseMain.class).parse(args);
    if (main.helpOption.showHelpIfRequested()) {
        return ;
    }
    boolean handled = main.run();
    if (!handled) {
        main.helpOption.help = true;
        main.helpOption.showHelpIfRequested();
        return ;
    }
}