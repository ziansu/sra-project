@java.lang.Override
public java.lang.String getFax() {
    if (com.silverpeas.util.StringUtil.isDefined(phone)) {
        return fax;
    }else
        if ((getUserFull()) != null) {
            return getUserFull().getValue("fax");
        }else {
            return null;
        }
    
}