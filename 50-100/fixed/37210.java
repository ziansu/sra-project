@java.lang.Override
public int getInvokeOpcode() {
    if (((modifiers) & (dyvil.reflect.Modifiers.STATIC)) != 0) {
        return dyvil.reflect.Opcodes.INVOKESTATIC;
    }
    if (((modifiers) & (dyvil.reflect.Modifiers.PRIVATE)) == (dyvil.reflect.Modifiers.PRIVATE)) {
        return dyvil.reflect.Opcodes.INVOKESPECIAL;
    }
    if (this.theClass.isInterface()) {
        return dyvil.reflect.Opcodes.INVOKEINTERFACE;
    }
    return dyvil.reflect.Opcodes.INVOKEVIRTUAL;
}