public void CalcFreq(java.lang.String[] words) {
    if (words == null) {
        return ;
    }
    for (java.lang.String word : words) {
        java.lang.Integer wf = frequency.get(word);
        if (wf == null) {
            wf = new java.lang.Integer(1);
            frequency.put(word, wf);
        }else {
            frequency.put(word, new java.lang.Integer(((wf.intValue()) + 1)));
        }
    }
}