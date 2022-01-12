private void appendLine(java.io.File file, int lineIndex) throws java.io.IOException {
    java.io.BufferedWriter output = new java.io.BufferedWriter(new java.io.FileWriter(file, true));
    output.append(((((((((MainActivity.name_arr[s_item]) + "^`") + (MainActivity.description_arr[s_item])) + "^`") + (MainActivity.progress_arr[s_item])) + "^`") + (MainActivity.progress_goal[s_item])) + "/n"));
    output.close();
}