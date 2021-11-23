public void saveHtml(java.lang.String saveLocation) {
    try {
        if ((this.htmlDocument) != null) {
            java.io.FileWriter fileWriter = new java.io.FileWriter(saveLocation);
            java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(fileWriter);
            bufferedWriter.write(this.htmlDocument.body().html());
            bufferedWriter.close();
        }
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}