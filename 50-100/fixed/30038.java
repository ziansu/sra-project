private sg.edu.cs2103aug2015_w13_2j.Task addTask(java.util.ArrayList<javafx.util.Pair<sg.edu.cs2103aug2015_w13_2j.Parser.Token, java.lang.String>> tokens) throws sg.edu.cs2103aug2015_w13_2j.TaskInterface.InvalidTaskException {
    sg.edu.cs2103aug2015_w13_2j.Task task = new sg.edu.cs2103aug2015_w13_2j.Task();
    updateTask(tokens, task);
    mTasks.add(task);
    determineType(task);
    sortByDeadline();
    java.lang.System.out.println("[Logic] Added task");
    java.lang.System.out.print(task);
    return task;
}