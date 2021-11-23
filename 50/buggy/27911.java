@buildcraft.api.transport.pipe.PipeEventHandler
public static void addActions(buildcraft.api.transport.pipe.PipeEventStatement.AddActionInternal event) {
    java.util.Collections.addAll(event.actions, BCTransportStatements.ACTION_PIPE_COLOUR);
}