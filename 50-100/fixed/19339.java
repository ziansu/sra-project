public static boolean checkFile() {
    if (!(FileUtil.clientFile.exists())) {
        try {
            FileUtil.clientFile.createNewFile();
        } catch (java.io.IOException e) {
            CheckInput.alertMessage("File not open", "Файл не создан", "Записи не сохраняться");
        }
        return false;
    }else
        return true;
    
}