private boolean FlexionTable() {
    begin("FlexionTable");
    if (!(FlexionTableKopf()))
        return reject();
    
    while (FlexionForm());
    if (!(RT()))
        return reject();
    
    if (!(RestOfLine()))
        return reject();
    
    return accept();
}