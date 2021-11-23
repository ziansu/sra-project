@java.lang.Override
public int execute(pw.phylame.qaf.cli.CLIDelegate arg0) {
    lombok.val plugins = app.getPlugins().values();
    java.lang.System.out.println(pw.phylame.jem.scj.addons.AddonsMessages.tr("listPlugins.tip", plugins.size()));
    for (lombok.val plugin : plugins) {
        printPlugin(plugin);
    }
    return 0;
}