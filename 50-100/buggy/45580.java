private static void writeScripts() throws java.io.IOException {
    int scriptCount = uk.ac.cam.november.boot.ScriptCreator.scriptName.length;
    for (int i = 0; i < scriptCount; i++) {
        java.io.File file = new java.io.File(("temp/" + (uk.ac.cam.november.boot.ScriptCreator.scriptName[i])));
        java.io.FileWriter fout = new java.io.FileWriter(file);
        fout.write(uk.ac.cam.november.boot.ScriptCreator.scriptContents[i]);
        file.setExecutable(true);
        fout.close();
    }
}