@java.lang.Override
public void doLink(java.lang.String field, com.steelypip.powerups.minxmlstar.MinXMLStar child, boolean first_in_group, boolean last_in_group) {
    this.pw.print(' ');
    this.pw.print(field);
    this.pw.print((first_in_group ? ":" : "+:"));
    this.starw.print(child);
}