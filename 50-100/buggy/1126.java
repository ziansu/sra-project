private void setTaskDetails(java.lang.String[] param, int num, com.tasma.Task parsedTask) {
    java.lang.String str = "";
    for (int i = 0; i < num; i++) {
        str += (param[i]) + " ";
    }
    parsedTask.setDetails(str.trim());
}