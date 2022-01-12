@java.lang.Override
public java.lang.String toString() {
    java.lang.StringBuffer sb = new java.lang.StringBuffer();
    sb.append("MatchSequence: ");
    for (int i = 0; i < (matchSeq.size()); i++) {
        sb.append(matchSeq.get(i).toString());
    }
    return sb.toString();
}