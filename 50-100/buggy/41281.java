private static void discoverTasks(java.lang.String taskFolder) {
    java.io.File tasksFolder = new java.io.File(taskFolder);
    if (tasksFolder.isDirectory()) {
        for (java.io.File task : tasksFolder.listFiles()) {
            java.lang.String taskname = task.getName().substring(0, task.getName().indexOf("_"));
            if (!(Main.tasks.contains(taskname)))
                Main.tasks.add(taskname);
            
        }
    }
}