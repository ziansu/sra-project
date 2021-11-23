public void setName(java.lang.String nameStr, boolean isFamilyNameLast) {
    java.lang.String[] nameSplit = nameStr.split(" ");
    familyNameLast = isFamilyNameLast;
    givenNames = new java.util.ArrayList<>();
    int number = -1;
    int ii = nameSplit.length;
    if (familyNameLast) {
        familyName = nameSplit[(--ii)];
    }else {
        familyName = nameSplit[(++number)];
    }
    while ((++number) < ii) {
        givenNames.add(nameSplit[number]);
    } 
}