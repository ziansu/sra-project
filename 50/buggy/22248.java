public final void setReturnValue(final ch.njol.skript.lang.function.FunctionEvent e, @org.eclipse.jdt.annotation.Nullable
final T[] value) {
    ch.njol.skript.Skript.info(("Trigger is " + (trigger.toString())));
    assert !(returnValueSet);
    returnValueSet = true;
    returnValue = value;
}