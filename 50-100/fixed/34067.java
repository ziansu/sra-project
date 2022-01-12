protected void load_settings() {
    try {
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader(new java.io.File(fry.oldschool.utils.App.mContext.getFilesDir(), fry.oldschool.utils.App.mContext.getResources().getString(R.string.file_settings))));
        java.lang.String line = br.readLine();
        if (line != null) {
            fry.oldschool.utils.App.conLis = new fry.oldschool.utils.ContactList(line.split(";"));
        }
    } catch (java.io.IOException ex) {
        ex.printStackTrace();
    }
    fry.oldschool.utils.App.conLis = new fry.oldschool.utils.ContactList();
}