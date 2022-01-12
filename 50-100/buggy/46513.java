public boolean runCommand(org.bukkit.command.CommandSender sender, java.lang.String[] args) {
    if ((args.length) == (this.args.length)) {
        for (int i = 0; i < (args.length); i++) {
            if (!(argsMatch(args[i], i))) {
                return false;
            }
        }
        execute(sender, args);
        return true;
    }
    return true;
}