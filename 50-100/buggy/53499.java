@java.lang.Override
public void run() {
    try {
        int c;
        while (true) {
            c = is.read();
            if (c == (-1))
                break;
            
            java.lang.System.out.write(c);
            java.lang.System.out.flush();
        } 
    } catch (java.io.IOException ex) {
        ex.printStackTrace();
    }
}