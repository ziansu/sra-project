private void search(java.lang.String s) {
    if (s.equals(""))
        return ;
    
    java.lang.String[] words = s.split("\\s+");
    wordsCount += words.length;
    for (java.lang.String m : words) {
    }
    java.lang.System.out.println(wordsCount);
    searchingTime = (java.lang.System.nanoTime()) - (initialTime);
}