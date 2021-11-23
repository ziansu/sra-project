public void saveData(java.lang.String savepath) {
    try {
        java.io.FileWriter fw = new java.io.FileWriter(savepath);
        java.io.BufferedWriter bw = new java.io.BufferedWriter(fw);
        writeData(bw);
        fw.close();
        bw.close();
    } catch (java.lang.Exception e) {
        return ;
    }
}