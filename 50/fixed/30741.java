@java.lang.Override
@org.eclipse.jdt.annotation.Nullable
public ch.njol.skript.util.Timespan deserialize(final java.lang.String s) {
    try {
        return new ch.njol.skript.util.Timespan(java.lang.Long.parseLong(s));
    } catch (final java.lang.NumberFormatException e) {
        return null;
    }
}