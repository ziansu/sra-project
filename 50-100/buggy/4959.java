private void parseTask(int day, java.util.HashMap<java.lang.String, java.util.Objects> map) {
    for (java.lang.String taskId : map.keySet()) {
        if ((tasks.get(day)) == null) {
            tasks.put(day, new java.util.ArrayList<java.lang.String>());
        }
        android.util.Log.i("logp", ("parsing task " + taskId));
        tasks.get(day).add(taskId);
    }
}