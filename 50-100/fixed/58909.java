public static void write(java.io.FileWriter writer, java.lang.String project, java.util.Date start) throws java.io.IOException {
    if (start != null) {
        writer.write(java.lang.String.format(timer.TimerStatus.LINE_FORMAT, project, start.getTime()));
    }else {
        writer.write(timer.TimerStatus.NULL);
    }
}