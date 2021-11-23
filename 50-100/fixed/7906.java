private static void getEmailRecursive(java.io.File emailFile, java.util.List<java.io.File> emailFiles) {
    if (!(emailFile.isDirectory())) {
        if (!(emailFile.isHidden())) {
            emailFiles.add(emailFile);
        }
    }else {
        for (java.io.File subFile : emailFile.listFiles()) {
            com.expee.ml.ExtractEmails.getEmailRecursive(subFile, emailFiles);
        }
    }
}