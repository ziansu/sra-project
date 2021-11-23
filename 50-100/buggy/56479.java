@org.junit.Before
public void setUp() {
    memory = new com.equinox.Memory();
    com.equinox.Todo todo1 = new com.equinox.Todo(new org.joda.time.DateTime(), com.equinox.MemoryTest.TASK_1);
    memory.add(todo1);
    com.equinox.Todo todo2 = new com.equinox.Todo(new org.joda.time.DateTime(), com.equinox.MemoryTest.TASK_2);
    memory.add(todo2);
    com.equinox.Todo todo3 = new com.equinox.Todo(new org.joda.time.DateTime(), com.equinox.MemoryTest.TASK_3);
    memory.add(todo3);
}