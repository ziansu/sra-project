public void executeRainTask() {
    rainTask = new com.example.alexahern.raindrop.GetRainTask(this);
    rainTask.execute();
}