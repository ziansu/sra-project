java.util.ArrayList<mainWindow.Pokemon> getPokemon() {
    readData();
    data = new java.util.ArrayList<mainWindow.Pokemon>();
    int i = 0;
    while (i < (masterList.size())) {
        data.add(masterList.get(i));
        i++;
    } 
    return data;
}