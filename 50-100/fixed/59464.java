@java.lang.Override
public dist.esper.core.message.NewStreamInstanceMessage read(com.esotericsoftware.kryo.Kryo kryo, com.esotericsoftware.kryo.io.Input input, java.lang.Class<dist.esper.core.message.NewStreamInstanceMessage> type) {
    dist.esper.core.message.NewStreamInstanceMessage nsim = new dist.esper.core.message.NewStreamInstanceMessage();
    nsim.primaryType = kryo.readObject(input, java.lang.Integer.class);
    nsim.sourceId = kryo.readObject(input, java.lang.String.class);
    nsim.streamContainer = ((dist.esper.core.flow.container.StreamContainer) (kryo.readClassAndObject(input)));
    return nsim;
}