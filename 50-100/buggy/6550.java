private java.util.List<com.example.johannes.colorpicker.Task> addTaskToList() {
    com.example.johannes.colorpicker.Task task = new com.example.johannes.colorpicker.Task();
    java.util.List<com.example.johannes.colorpicker.Task> tasks = new java.util.ArrayList<>();
    for (int i = 0; i < (colors.size()); i++) {
        task.setOtsikko(colors.get(i).getHex());
        tasks.add(task);
    }
    return tasks;
}