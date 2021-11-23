private void search(java.lang.String s) {
    if (s.equals(""))
        return ;
    
    java.lang.String[] words = s.split("\\s+");
    for (java.lang.String m : words) {
        if (!(map.containsKey(m)))
            (fails)++;
        else
            (success)++;
        
        (wordsCount)++;
    }
    searchingTime = (java.lang.System.nanoTime()) - (initialTime);
}