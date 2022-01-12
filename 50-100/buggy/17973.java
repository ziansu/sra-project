public main.Distance getDistanceFrom(main.Sentence sentence) {
    if (nearlyEquals(sentence))
        return Distance.CORRECT;
    
    java.lang.String str = sentence.getFormatted().replaceAll(" ", "");
    int d = main.SentenceUtil.getDistance(this.formatted.replaceAll(" ", ""), str);
    if (d <= 3) {
        return Distance.CLOSE;
    }else
        if (d <= 6) {
            return Distance.FAR;
        }else {
            return Distance.INCORRECT;
        }
    
}