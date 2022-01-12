@java.lang.Override
public int compare(de.vanhck.data.User o1, de.vanhck.data.User o2) {
    return ((int) (java.lang.Math.round(((de.vanhck.Util.getEndScore(o2.getScores())) - (de.vanhck.Util.getEndScore(o1.getScores()))))));
}