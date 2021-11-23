@java.lang.Override
public boolean shouldExecute(sx.blah.discord.handle.obj.IMessage input) {
    return input.getContent().contains(command);
}