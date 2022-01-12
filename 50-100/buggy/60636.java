public static void main(java.lang.String[] args) {
    java.lang.String apkFileDir = "../raw/apks";
    java.lang.String iconOutputDir = "../raw/icons";
    java.lang.String aaptFile = "../raw/aapt.exe";
    java.lang.String outputJsonfile = "../raw/apks_info.json";
    java.io.File file = new java.io.File("kkkkkkkk.txt");
    if (!(file.exists()))
        try {
            file.createNewFile();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    
    com.example.tools.MyTools tools = new com.example.tools.MyTools();
    tools.extractIconsFromFile(apkFileDir, iconOutputDir, aaptFile);
    tools.generateJsonFile(outputJsonfile);
}