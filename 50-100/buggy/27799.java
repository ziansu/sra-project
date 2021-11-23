@java.lang.Override
public int compareTo(@javax.annotation.Nonnull
org.winterblade.minecraft.harmony.utility.BasePrioritizedData o) {
    if ((priority) != (o.priority))
        return (priority.ordinal()) - (o.priority.ordinal());
    
    return matcher.getClass().getName().compareTo(o.matcher.getClass().getName());
}