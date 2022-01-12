public int look(Topic x, int minYNow) {
    int toRet = loopThru(x, minYNow);
    if (continueOrNot(x)) {
        java.lang.System.out.println(("yes " + x));
        java.util.ArrayList<Topic> sub = x.subtopics;
        Topic lastOfSub = sub.get(((sub.size()) - 1));
        return look(lastOfSub, toRet);
    }
    java.lang.System.out.println(toRet);
    java.lang.System.out.println((toRet + 25));
    return toRet + 25;
}