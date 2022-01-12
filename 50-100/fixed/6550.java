private java.util.List<com.example.johannes.colorpicker.Task> addTaskToList() {
    java.util.List<com.example.johannes.colorpicker.Task> tasks = new java.util.ArrayList<>();
    for (int i = 0; i < (colors.size()); i++) {
        com.example.johannes.colorpicker.Task task = new com.example.johannes.colorpicker.Task();
        task.setOtsikko(colors.get(i).getHex());
        tasks.add(task);
    }
    return tasks;
}