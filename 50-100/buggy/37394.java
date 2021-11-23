public void testAlphabeticalSort1() {
    java.util.ArrayList<nl.mpcjanssen.simpletask.task.Task> tasks = new java.util.ArrayList<nl.mpcjanssen.simpletask.task.Task>();
    nl.mpcjanssen.simpletask.task.Task t1 = new nl.mpcjanssen.simpletask.task.Task(0, "2011-01-01 B");
    nl.mpcjanssen.simpletask.task.Task t2 = new nl.mpcjanssen.simpletask.task.Task(0, "2012-01-01 A");
    tasks.add(t1);
    tasks.add(t2);
    assertSame(t1, tasks.get(0));
    java.util.Collections.sort(tasks, new nl.mpcjanssen.simpletask.sort.AlphabeticalComparator());
    assertSame(t2, tasks.get(0));
}