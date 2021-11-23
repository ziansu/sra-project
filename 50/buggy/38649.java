public void startTask() {
    com.example.cyanhearth.wordfinder.LoadDictionaryFragment.LoadDictionaryTask task = new com.example.cyanhearth.wordfinder.LoadDictionaryFragment.LoadDictionaryTask();
    task.execute(currentDict);
}