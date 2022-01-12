private void allocateCorrectTimeArray(org.jimple.planner.Task newTask) throws java.io.IOException {
    if (((newTask.getFromTime()) == null) && ((newTask.getToTime()) == null)) {
        floating.add(newTask);
    }else
        if ((newTask.getFromTimeString().equals(null)) && ((newTask.getToTime()) != null)) {
            deadlines.add(newTask);
        }else {
            events.add(newTask);
        }
    
    packageForSavingInFile();
}