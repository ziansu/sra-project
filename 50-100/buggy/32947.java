@java.lang.Override
public javax.swing.JComponent description() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder((("<html>" + (net.sf.jabref.logic.l10n.Localization.lang("Changes have been made to the following metadata elements"))) + ":<p>"));
    for (net.sf.jabref.collab.MetaDataChange.MetaDataChangeUnit unit : changes) {
        sb.append("<br>&nbsp;&nbsp;");
        sb.append(unit.key);
    }
    sb.append("</html>");
    tp.setText(sb.toString());
    return sp;
}