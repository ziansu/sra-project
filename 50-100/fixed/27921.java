@java.lang.Override
public boolean isAnnotatable(edu.jhu.hlt.concrete.Communication c) {
    boolean hasSections = (c.isSetSectionList()) && ((c.getSectionListSize()) > 0);
    boolean valid = ((!hasSections) && (c.isSetText())) && (!(c.getText().equals("")));
    return valid;
}