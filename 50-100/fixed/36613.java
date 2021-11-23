@org.junit.Before
public void setUp() {
    baseList = new java.util.LinkedList<>();
    for (int i = 0; i < ((ru.mipt.diht.students.ale3otik.moduleTests.lockingQueueTest.LockingQueueTest.MAX_QUEUE_SIZE) - 10); ++i) {
        baseList.add(i);
    }
    queue = new ru.mipt.diht.students.ale3otik.threads.lockingqueue.LockingQueue(ru.mipt.diht.students.ale3otik.moduleTests.lockingQueueTest.LockingQueueTest.MAX_QUEUE_SIZE);
}