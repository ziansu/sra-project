public static com.github.xzwj87.todolist.schedule.observer.ScheduleDataObserver getInstance() {
    if ((com.github.xzwj87.todolist.schedule.observer.ScheduleDataObserver.mInstance) == null) {
        com.github.xzwj87.todolist.schedule.observer.ScheduleDataObserver.mInstance = new com.github.xzwj87.todolist.schedule.observer.ScheduleDataObserver(new android.os.Handler());
    }
    return com.github.xzwj87.todolist.schedule.observer.ScheduleDataObserver.mInstance;
}