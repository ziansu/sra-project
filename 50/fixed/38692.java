@java.lang.Override
public int compareTo(xl.application.social.whatsup.model.feed.query.ControversialOrder other) {
    int cmp = java.lang.Double.compare(other.score, score);
    return cmp == 0 ? -(timestamp.compareTo(other.timestamp)) : cmp;
}