private void changeLine(java.io.File file, int lineIndex, int endDate) throws java.io.IOException {
    java.io.BufferedWriter output = new java.io.BufferedWriter(new java.io.FileWriter(file, true));
    output.append((((((((((MainActivity.name_arr[s_item]) + "^`") + (MainActivity.description_arr[s_item])) + "^`") + "^`") + (MainActivity.progress_arr[s_item])) + "^`") + endDate) + "/n"));
    output.close();
}