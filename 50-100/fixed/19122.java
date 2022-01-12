public void printLog() throws java.lang.InterruptedException {
    java.io.BufferedWriter bw = null;
    java.io.FileWriter fw = null;
    try {
        fw = new java.io.FileWriter("log.txt");
        bw = new java.io.BufferedWriter(fw);
        java.lang.String newLine = queue.remove();
        while (newLine != null) {
            bw.write((newLine + "\n"));
            newLine = queue.remove();
        } 
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}