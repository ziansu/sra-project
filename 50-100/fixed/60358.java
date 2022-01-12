public double getMatchPercent(java.lang.String desc, double weight, java.util.HashMap<java.lang.String, java.lang.Integer> frequency) {
    double percent = 0;
    java.lang.String[] words = desc.split(" ");
    for (java.lang.String word : words) {
        word = word.toLowerCase();
        if (frequency.containsKey(word))
            percent += frequency.get(word);
        
    }
    return weight > 0 ? percent / weight : percent;
}