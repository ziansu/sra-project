@java.lang.Override
protected void onPostExecute(java.util.ArrayList<pp.example.one.scheduler.EntryToDo> allEntries) {
    super.onPostExecute(allEntries);
    pp.example.one.scheduler.CustomAdapterToDo customAdapterToDo = new pp.example.one.scheduler.CustomAdapterToDo(this, allEntries);
    toDoList.setAdapter(customAdapterToDo);
}