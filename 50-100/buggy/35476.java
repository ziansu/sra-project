public java.util.ArrayList<java.lang.String> write(java.util.ArrayList<java.lang.String> taskStrings) {
    try {
        java.io.BufferedWriter writer = new java.io.BufferedWriter(new java.io.FileWriter(new java.io.File(this._fileName), true));
        for (java.lang.String taskString : taskStrings) {
            writer.write(taskString);
            writer.newLine();
        }
        writer.close();
    } catch (java.io.IOException e) {
        exception.ExceptionHandler.handle(e);
    }
    return taskStrings;
}