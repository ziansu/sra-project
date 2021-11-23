public static void main(java.lang.String[] args) {
    new blockchain.third.controller.JoinController();
    blockchain.third.controller.MakeConcensus.listen();
    new blockchain.third.controller.TerminalController().decideOperation();
}