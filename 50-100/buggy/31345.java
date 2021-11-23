@java.lang.Override
public void run() {
    java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(process.getInputStream()), 1);
    try {
        int c = 0;
        while ((c = reader.read()) != (-1)) {
            callback.character(((char) (c)));
        } 
    } catch (java.io.IOException e) {
    }
}