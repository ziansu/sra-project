@java.lang.Override
public boolean apply(@javax.annotation.Nonnull
org.apache.jackrabbit.oak.spi.state.ChildNodeEntry input) {
    return input.getNodeState().exists();
}