public static void main(java.lang.String[] args) throws java.io.IOException {
    char nodeName = args[0].charAt(0);
    int portNum = java.lang.Integer.parseInt(args[1]);
    java.lang.String fileName = args[2];
    java.lang.System.out.println(((((nodeName + " ") + portNum) + " ") + fileName));
    Dvr node = new Dvr(nodeName, portNum, fileName);
    java.lang.System.out.println("running dvr");
    node.runDvr();
}