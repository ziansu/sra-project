@java.lang.Override
public void install() {
    java.util.List<java.lang.String> commands = com.google.common.collect.Lists.newLinkedList();
    commands.addAll(brooklyn.util.ssh.BashCommands.commandsToDownloadUrlsAs(resolver.getTargets(), getWeaveCommand()));
    commands.add(("chmod 755 " + (getWeaveCommand())));
    newScript(brooklyn.networking.sdn.weave.INSTALLING).body.append(commands).execute();
}