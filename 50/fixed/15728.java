@java.lang.Override
public boolean isAvailable(org.collabthings.environment.impl.CTToolState toolstate) {
    return ((tool) == null) || (this.tool.equals(toolstate));
}