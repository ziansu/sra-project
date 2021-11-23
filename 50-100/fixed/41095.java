private static void registerDefaultCommands(wycc.WyTool tool) {
    wycc.lang.Command[] defaultCommands = new wycc.lang.Command[]{  };
    wycc.lang.Module.Context context = tool.getContext();
    for (wycc.lang.Command c : defaultCommands) {
        context.register(wycc.lang.Command.class, c);
    }
}