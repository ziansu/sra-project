public static gfiles.text.CSVFileReader loadUsers() {
    try {
        gbank.io.LogIn.userFile = new gfiles.text.CSVFile(gfiles.file.VirtualFile.load(new java.io.File(gbank.statics.FileLocations.getUserLoginFile())));
        return new gfiles.text.CSVFileReader(gbank.io.LogIn.userFile);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return null;
}