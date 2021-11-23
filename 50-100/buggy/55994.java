public boolean doCommand(utilties.models.Game game, int id) {
    for (interpreter.Check c : this.checks) {
        if (!(c.conditionIsTrue(game))) {
            return false;
        }
    }
    executeFunction(game, id);
    return true;
}