public java.util.ArrayList<Card> seeThree() {
    if ((p.size()) <= 3) {
        return p;
    }else {
        java.util.ArrayList<Card> cArr = new java.util.ArrayList<Card>();
        cArr.addAll(p.subList(((p.size()) - 4), ((p.size()) - 1)));
        return cArr;
    }
}