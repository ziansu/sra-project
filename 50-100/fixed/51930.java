@org.junit.Test
public void testSerializeAndDeserialize() {
    jfdi.storage.entities.Task task = new jfdi.storage.entities.Task(1, jfdi.storage.Constants.TEST_TASK_DESCRIPTION_1, jfdi.storage.Constants.TEST_TASK_STARTDATETIME, jfdi.storage.Constants.TEST_TASK_ENDDATETIME, false);
    java.lang.String serializedJson = jfdi.storage.serializer.Serializer.serialize(task);
    jfdi.storage.entities.Task deserializedTask = jfdi.storage.serializer.Serializer.deserialize(serializedJson, jfdi.storage.entities.Task.class);
    org.junit.Assert.assertEquals(Constants.TEST_TASK_DESCRIPTION_1, deserializedTask.getDescription());
    org.junit.Assert.assertEquals(Constants.TEST_TASK_STARTDATETIME, deserializedTask.getStartDateTime());
    org.junit.Assert.assertEquals(Constants.TEST_TASK_ENDDATETIME, deserializedTask.getEndDateTime());
    org.junit.Assert.assertEquals(false, deserializedTask.isCompleted());
}