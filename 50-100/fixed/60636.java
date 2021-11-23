public static void main(java.lang.String[] args) {
    java.lang.String apkFileDir = "../raw/apks";
    java.lang.String iconOutputDir = "../raw/icons";
    java.lang.String aaptFile = "../raw/aapt.exe";
    java.lang.String outputJsonfile = "../raw/apks_info.json";
    com.example.tools.MyTools tools = new com.example.tools.MyTools();
    tools.extractIconsFromFile(apkFileDir, iconOutputDir, aaptFile);
    tools.generateJsonFile(outputJsonfile);
}