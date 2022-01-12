public static void main(java.lang.String[] args) throws java.io.IOException {
    char nodeName = args[0].charAt(0);
    int portNum = java.lang.Integer.parseInt(args[1]);
    java.lang.String fileName = args[2];
    Dvr node = new Dvr(nodeName, portNum, fileName);
    node.runDvr();
}