@java.lang.Override
public void doCommand(java.lang.String[] args) {
    if ((args == null) || ((args.length) != 2))
        view.display("solve command need 2 arguments:\nsolve <MAZE_NAME> <METHOD>");
    else {
        this.mazeName = args[0];
        this.method = args[1];
        model.solveMaze(mazeName, method);
    }
}