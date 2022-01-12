private static void discoverTasks(java.lang.String taskFolder) {
    java.io.File tasksFolder = new java.io.File(taskFolder);
    if (tasksFolder.isDirectory()) {
        for (java.io.File task : tasksFolder.listFiles()) {
            java.lang.String taskname = task.getName().substring(((task.getName().indexOf("_")) + 1));
            if (!(Main.tasks.contains(taskname)))
                Main.tasks.add(taskname);
            
        }
    }
}