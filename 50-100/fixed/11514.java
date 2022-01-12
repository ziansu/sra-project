@java.lang.Override
public akayerov.getsnils.IpraFile getNextDir() {
    while ((idx) < (fList.length)) {
        java.lang.String sogrn = null;
        if (!(fList[idx].isFile())) {
            sogrn = fList[idx].getName();
            java.lang.String namefile = sogrn;
            return new akayerov.getsnils.IpraFile(fList[((idx)++)].getAbsolutePath(), sogrn, namefile);
        }
        (idx)++;
    } 
    return null;
}