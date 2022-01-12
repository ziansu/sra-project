@java.lang.Override
public void handle(final java.util.LinkedList<java.lang.String> args) {
    if (!(supports(args)))
        return ;
    
    args.removeFirst();
    final java.lang.String commandToRun = args.removeFirst();
    final java.lang.String paramString = (org.scijava.console.ConsoleUtils.hasParam(args)) ? args.removeFirst() : "";
    run(commandToRun, paramString);
}