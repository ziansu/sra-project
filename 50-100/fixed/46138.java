public java.util.List<com.nearsoft.androidschool.todoapp.models.ToDoContent> getData() {
    java.util.List<com.nearsoft.androidschool.todoapp.models.ToDoContent> data = new java.util.ArrayList<>();
    com.nearsoft.androidschool.todoapp.models.ToDoContent first = new com.nearsoft.androidschool.todoapp.models.ToDoContent("task 1", new java.util.Date(), true, "at Nearsoft");
    first.setNotes("sample text, text sample, hehe hehe\nmore text, here is another text and more samples\nsampletext, stub, lalala i hate the word \"fake\"");
    data.add(first);
    data.add(new com.nearsoft.androidschool.todoapp.models.ToDoContent("task 2", null, false, "at Nearsoft"));
    data.add(new com.nearsoft.androidschool.todoapp.models.ToDoContent("task 3", null, false, "at Cafenio"));
    return data;
}