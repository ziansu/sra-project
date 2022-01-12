@java.lang.Override
public boolean isUsernameIndex(java.lang.String[] args, int index) {
    if ((index == 0) || ((args.length) == 0))
        return false;
    
    java.lang.String[] subArgs = java.util.Arrays.copyOfRange(args, 1, args.length);
    return getSubCommand(args[0]).isUsernameIndex(subArgs, (index - 1));
}