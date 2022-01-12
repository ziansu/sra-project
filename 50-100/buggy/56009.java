@java.lang.Override
public void execute(threemonthjunior.morandblack.m1ke.ApplicationState appState) {
    if (!(validateStateAndRepo(appState)))
        return ;
    
    if (parametersEmpty()) {
        threemonthjunior.morandblack.m1ke.Console.print("Please supply branch name!");
        return ;
    }
    java.lang.String branchName = parameters[0];
    appState.getCurrentRepo().setActiveBranch(branchName);
    if (Settings.DEBUG_MODE)
        threemonthjunior.morandblack.m1ke.Console.print((("get branch '" + branchName) + "': SUCCESS"));
    
}