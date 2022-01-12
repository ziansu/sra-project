@java.lang.Override
public org.eclipse.debug.core.model.IValue getValue() {
    return new edu.kit.iti.formal.pse.worthwhile.debugger.model.WorthwhileValue(this.getDebugTarget(), null, this.value);
}