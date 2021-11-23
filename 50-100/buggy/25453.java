@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent in) {
    android.util.Log.v(net.three_headed_monkey.service.PeriodicWorkReceiver.TAG, "PeriodicWorkReceiver called");
    android.content.Intent intent;
    intent = new android.content.Intent(context, net.three_headed_monkey.commands.PullCommandsCommand.class);
    intent.putExtra(CommandExecutorService.INTENT_COMMAND_STRING_PARAM, PullCommandsCommand.COMMAND_STRING);
    intent.putExtra(CommandExecutorService.INTENT_OUTGOING_COMMUNICATION_TYPE_PARAM, OutgoingCommandCommunicationFactory.OUTGOING_COMMUNICATION_TYPE_BROADCAST);
    context.startService(intent);
    intent = new android.content.Intent(context, net.three_headed_monkey.service.CommandExecutorService.class);
    intent.putExtra(CommandExecutorService.INTENT_COMMAND_STRING_PARAM, UpdateLocationHistoryCommand.COMMAND_STRING);
    intent.putExtra(CommandExecutorService.INTENT_OUTGOING_COMMUNICATION_TYPE_PARAM, OutgoingCommandCommunicationFactory.OUTGOING_COMMUNICATION_TYPE_BROADCAST);
    context.startService(intent);
}