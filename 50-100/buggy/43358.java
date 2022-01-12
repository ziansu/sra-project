public java.lang.String[] getMenuOptionsInString() {
    java.lang.String[] arrayStringList = new java.lang.String[functions.size()];
    for (int i = 0; i < (functions.size()); i++)
        arrayStringList[i] = functions.get(i).toString();
    
    return arrayStringList;
}