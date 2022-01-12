static char[] middleName(char[] charrayM) {
    int i = 0;
    while ((charrayM[i]) != ' ') {
        i++;
    } 
    char[] Middlename = new char[i];
    for (int j = 0; j < i; j++) {
        Middlename[j] = charrayM[j];
    }
    return null;
}