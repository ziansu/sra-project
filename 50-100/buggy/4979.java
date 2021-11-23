private java.util.ArrayList<java.time.LocalDate> extractExceptionDates(java.lang.String inputString) {
    int editIndex = getEditIndex(inputString, 2);
    main.java.Task task = main.java.Controller.getInstance().getDisplayedTasks().get(editIndex);
    java.util.ArrayList<java.time.LocalDate> exceptionDates = task.getExceptionDates();
    return exceptionDates;
}