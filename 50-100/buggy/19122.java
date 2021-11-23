public void printLog() throws java.lang.InterruptedException {
    java.io.BufferedWriter bw = null;
    java.io.FileWriter fw = null;
    try {
        fw = new java.io.FileWriter("log.txt");
        bw = new java.io.BufferedWriter(fw);
        java.lang.String newLine = queue.dequeue();
        while (newLine != null) {
            bw.write((newLine + "\n"));
            newLine = queue.dequeue();
        } 
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}