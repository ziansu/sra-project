public void setFile() {
    filename = name;
    inputstream = context.getAssets().open(filename);
    bufferedreader = new java.io.BufferedReader(new java.io.InputStreamReader(inputstream));
    java.lang.String str;
    while (str = (bufferedreader.readLine()) != null) {
        (text_num)++;
    } 
}