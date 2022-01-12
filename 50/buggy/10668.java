public void uploadTasks() {
    for (com.droneemployee.client.SharedTaskList.Observer observer : observers) {
        tasks.clear();
        observer.updateUploadTasks();
    }
}