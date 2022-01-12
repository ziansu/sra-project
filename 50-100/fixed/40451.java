@java.lang.Override
public ballmerpeak.stargate.commands.InputCommand nextCommand() {
    enter();
    log("SkeletonInputCommandFactory#nextCommand");
    if ((index) == (commands.size()))
        return null;
    
    leave();
    return commands.get(((index)++));
}