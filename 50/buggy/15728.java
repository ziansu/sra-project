@java.lang.Override
public boolean isAvailable(org.collabthings.environment.impl.CTToolState toolstate) {
    return ((this.tool) == toolstate) || ((tool) == null);
}