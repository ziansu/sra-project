public int look(Topic x, int minYNow) {
    int toRet = loopThru(x, minYNow);
    if (continueOrNot(x)) {
        java.lang.System.out.println(("yes " + x));
        java.util.ArrayList<Topic> sub = x.subtopics;
        Topic lastOfSub = sub.get(((sub.size()) - 1));
        look(lastOfSub, toRet);
    }
    return toRet + 25;
}