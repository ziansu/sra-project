public static void init() {
    Main.In.br = new java.io.BufferedReader(new java.io.InputStreamReader(java.lang.System.in));
    try {
        Main.In.br = new java.io.BufferedReader(new java.io.FileReader("/home/ubuntu/workspace/data.txt"));
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}