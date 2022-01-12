public void addSampleItems() {
    java.lang.String[] initialData = new java.lang.String[]{ "Do APCS project" , "Finish English paper" , "This is a very long to do item that has to be done soon!" , "Proofread resume" , "Get gas in the car" , "Deposit paycheck" };
    for (java.lang.String description : initialData) {
        com.mrjaffesclass.apcs.todolist.ToDoItem item = new com.mrjaffesclass.apcs.todolist.ToDoItem((-1), description, null);
        appModel.putItem(item);
    }
}