public void uploadTasks() {
    tasks.clear();
    for (com.droneemployee.client.SharedTaskList.Observer observer : observers) {
        observer.updateUploadTasks();
    }
}