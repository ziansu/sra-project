public void run() {
    while (true) {
        micropascalcompiler.TokenContainer t = this.dispatcher.nextToken();
        if (t.getError()) {
            break;
        }
        char[] buf = new char[255];
        try {
            this.inFile.read(buf, 0, t.getLength());
        } catch (java.lang.Exception e) {
        }
        java.lang.System.out.println(t.getToken());
    } 
}