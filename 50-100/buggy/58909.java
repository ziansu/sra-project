public static void write(java.io.FileWriter writer, java.lang.String project, java.util.Date start) throws java.io.IOException {
    if (start != null) {
        final java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat(timer.TimerStatus.DATE_FORMAT);
        writer.write(java.lang.String.format(timer.TimerStatus.LINE_FORMAT, project, dateFormat.format(start)));
    }else {
        writer.write(timer.TimerStatus.NULL);
    }
}