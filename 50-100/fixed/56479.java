@org.junit.Before
public void setUp() {
    memory = new com.equinox.Memory();
    todo1 = new com.equinox.Todo(new org.joda.time.DateTime(), com.equinox.MemoryTest.TASK_1);
    memory.add(todo1);
    todo2 = new com.equinox.Todo(new org.joda.time.DateTime(), com.equinox.MemoryTest.TASK_2);
    memory.add(todo2);
    todo3 = new com.equinox.Todo(new org.joda.time.DateTime(), com.equinox.MemoryTest.TASK_3);
    memory.add(todo3);
}