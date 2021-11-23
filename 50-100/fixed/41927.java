public void run() {
    java.util.Scanner input = new java.util.Scanner(java.lang.System.in);
    java.lang.String enter = input.nextLine();
    CommonLibs.Commands.UnsubscribeCommand cmd = ((CommonLibs.Commands.SubscribeCommand) (command)).cancleCommand();
    java.lang.String unsub = cmd.toJSON();
    while (listen) {
        if (enter.isEmpty()) {
            communicator.writeData(unsub);
            break;
        }
    } 
}