@java.lang.Override
public boolean shouldExecute(sx.blah.discord.handle.obj.IMessage input) {
    return (null != (input.getContent())) && (input.getContent().contains(command));
}