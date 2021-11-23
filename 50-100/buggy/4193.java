public static boolean catDog(java.lang.String str) {
    int catCount = 0;
    int dogCount = 0;
    for (int i = 0; i < ((str.length()) - 2); i += 3) {
        java.lang.String temp = str.substring(i, (i + 3));
        if (temp.equals("cat"))
            catCount++;
        else
            if (temp.equals("dog"))
                dogCount++;
            
        
    }
    return catCount == dogCount;
}