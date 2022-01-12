@java.lang.Override
public void addActions(buildcraft.api.transport.pipe.PipeEventStatement.AddActionInternal event) {
    super.addActions(event);
    java.util.Collections.addAll(event.actions, BCTransportStatements.ACTION_PIPE_COLOUR);
}