@org.junit.Test
@java.lang.Override
public void shouldSerialiseAndDeserialiseOperation() throws com.fasterxml.jackson.core.JsonProcessingException, uk.gov.gchq.gaffer.exception.SerialisationException {
    final uk.gov.gchq.gaffer.operation.impl.output.ToVertices op = new uk.gov.gchq.gaffer.operation.impl.output.ToVertices.Builder().input(new uk.gov.gchq.gaffer.operation.data.EntitySeed("2")).edgeVertices(EdgeVertices.BOTH).build();
    byte[] json = uk.gov.gchq.gaffer.operation.impl.output.ToVerticesTest.serialiser.serialise(op, true);
    final uk.gov.gchq.gaffer.operation.impl.output.ToVertices deserialisedOp = uk.gov.gchq.gaffer.operation.impl.output.ToVerticesTest.serialiser.deserialise(json, uk.gov.gchq.gaffer.operation.impl.output.ToVertices.class);
    org.junit.Assert.assertNotNull(deserialisedOp);
}