public void done(main.data.Task task) {
    main.logic.Receiver.logger.log(java.util.logging.Level.INFO, "done command");
    for (main.data.Task t : allTasks) {
        if (t.equals(task)) {
            t.setIsCompleted();
        }
    }
    initiateSave();
}