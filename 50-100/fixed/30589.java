@java.lang.Override
@java.lang.SuppressWarnings(value = "null")
public java.lang.Class<?>[] acceptChange(final ch.njol.skript.classes.Changer.ChangeMode mode) {
    if ((((mode == (ch.njol.skript.classes.Changer.ChangeMode.SET)) || (mode == (ch.njol.skript.classes.Changer.ChangeMode.ADD))) || (mode == (ch.njol.skript.classes.Changer.ChangeMode.REMOVE))) || (mode == (ch.njol.skript.classes.Changer.ChangeMode.DELETE)))
        return new java.lang.Class[]{ java.lang.Number.class };
    
    return null;
}