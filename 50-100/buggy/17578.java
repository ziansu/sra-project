private void configuratePath() {
    java.util.Calendar now = java.util.Calendar.getInstance();
    logPath = ((((((PARENT_FOLDER) + (now.get(java.util.Calendar.YEAR))) + "/") + (now.get(java.util.Calendar.MONTH))) + "/") + (now.get(java.util.Calendar.DAY_OF_MONTH))) + "/";
    new java.io.File(logPath).mkdirs();
}