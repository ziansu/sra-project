public static void main(java.lang.String[] args) {
    if ((args.length) != 1) {
        java.lang.System.out.println("Please enter the bots token as the first argument e.g java -jar thisjar.jar tokenhere");
        return ;
    }
    Main.cli = BotUtils.getBuiltDiscordClient(args[0]);
    Main.cli.login();
    Commands c = new Commands();
    Request r = new Request();
    Help h = new Help();
}