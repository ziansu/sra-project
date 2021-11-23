@java.lang.Override
public jumpingalien.program.statement.ExecutionState execute(jumpingalien.model.GameObject executingObject) {
    if (executingObject instanceof jumpingalien.model.Mazub)
        ((jumpingalien.model.Mazub) (executingObject)).startDuck();
    else {
        executingObject.getProgram().setStatementsLeft(0);
        executingObject.getProgram().setRunTimeError(true);
        return ExecutionState.NOTDONE;
    }
    return ExecutionState.DONE;
}