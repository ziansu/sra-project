private void stop() {
    java.lang.System.out.println();
    tasks.sort(Task.EndTimeComparator);
    for (int i = 0; i < (tasks.size()); i++) {
        Task temp = tasks.get(i);
        java.lang.System.out.print((((temp.getName()) + ":") + (temp.getWaitingTime())));
        if (i < ((tasks.size()) - 1))
            java.lang.System.out.print(",");
        
    }
}