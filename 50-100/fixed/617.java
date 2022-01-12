public java.lang.String call(java.lang.String subGroup, java.lang.String candidateFullname) {
    this.chosenSubGroup = subGroup;
    java.lang.String set = new java.lang.String("Text not set");
    try {
        set = textFromProfile(candidateFullname);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    java.lang.System.out.println(set);
    return set;
}