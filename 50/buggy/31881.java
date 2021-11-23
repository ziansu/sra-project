@java.lang.Override
public boolean match(org.yucs.spotter.regex.Matcher m) throws org.yucs.spotter.regex.RegexException {
    int pos = m.getTextPosition();
    boolean ret = t.match(m);
    m.setTextPosition(pos);
    return next.match(m);
}