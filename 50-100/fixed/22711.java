public int convertToStep(java.lang.String execution) {
    java.lang.System.out.println(execution);
    double timeExecution = 0;
    timeExecution = java.lang.Double.parseDouble(execution);
    double execOrder = ((double) (timeExecution / 60));
    return ((int) ((execOrder + execOrder) + 1));
}