@java.lang.Override
public java.lang.String getFax() {
    if (org.silverpeas.util.StringUtil.isDefined(phone)) {
        return fax;
    }else
        if ((getUserFull()) != null) {
            return getUserFull().getValue("fax");
        }else {
            return null;
        }
    
}