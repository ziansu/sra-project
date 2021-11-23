public int loopThru(Topic x, int minYNow) {
    int lowY = minYNow;
    java.util.ArrayList<Topic> now = x.subtopics;
    Topic current = now.get(((now.size()) - 1));
    java.lang.System.out.println(("last " + current));
    java.lang.System.out.println(("current " + current));
    lowY = current.leftParCor()[1];
    return lowY;
}