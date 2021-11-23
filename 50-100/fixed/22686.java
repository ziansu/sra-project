public int history(java.lang.String text) {
    java.lang.String[] sarray = new java.lang.String[]{ "��ʷ" , "����" , "�Ļ�" };
    int index;
    int returnint = 0;
    for (int i = 0; i < (sarray.length); i++) {
        index = text.indexOf(sarray[i]);
        if (index != (-1)) {
            returnint = 4;
            break;
        }
    }
    return returnint;
}