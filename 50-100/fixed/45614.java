@java.lang.Override
public java.lang.String toString(@org.eclipse.jdt.annotation.Nullable
final org.bukkit.event.Event e, final boolean debug) {
    if ((e == null) || ((type) == null))
        return "bottle of water";
    
    assert (type) != null;
    return ch.njol.skript.util.PotionEffectUtils.getPotionName(type.getSingle(e), ((mod) == 2), ((mod) == 1));
}