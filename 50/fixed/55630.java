@java.lang.Override
public void setInterproceduralForControlGraphComputation(boolean interprocedural) {
    if ((getExecution()) != null) {
        getExecution().setInterprocedural(interprocedural);
    }
}