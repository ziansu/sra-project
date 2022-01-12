public final java.lang.String getString(java.lang.String name, int maxlength, java.lang.String defaultvalue) {
    java.lang.String s = getString(name);
    if (!(org.giiwa.core.bean.X.isEmpty(s))) {
        if ((s.getBytes().length) > maxlength) {
            s = org.giiwa.core.base.Html.create(s).text(maxlength);
        }
    }else {
        s = defaultvalue;
    }
    return s;
}