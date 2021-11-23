public java.lang.Boolean save() {
    if (data.saveDataset(filename, contacts)) {
        return true;
    }else {
        return false;
    }
}