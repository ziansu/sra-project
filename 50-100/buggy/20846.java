private static void loadConfig(java.io.File file) throws com.git.ifly6.javatelegram.JTelegramException, java.io.FileNotFoundException {
    com.git.ifly6.communique.CommuniquéFileReader fileReader = new com.git.ifly6.communique.CommuniquéFileReader(file);
    if (fileReader.isCompatible(com.git.ifly6.marconi.Marconi.version)) {
        com.git.ifly6.marconi.Marconi.keys = fileReader.getKeys();
        com.git.ifly6.marconi.Marconi.recipients = fileReader.getRecipients();
        com.git.ifly6.marconi.Marconi.isRecruitment = fileReader.getRecruitmentFlag();
    }else {
        throw new com.git.ifly6.javatelegram.JTelegramException();
    }
}