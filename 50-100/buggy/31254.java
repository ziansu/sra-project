@java.lang.Override
public org.fenixedu.commons.i18n.LocalizedString getName() {
    if ((super.getName()) != null) {
        if ((getDegree().getPhdProgram()) != null) {
            return new org.fenixedu.commons.i18n.LocalizedString().with(java.util.Locale.getDefault(), getDegree().getPhdProgram().getPresentationName());
        }else {
            return new org.fenixedu.commons.i18n.LocalizedString().with(java.util.Locale.getDefault(), getDegree().getPresentationName());
        }
    }else {
        return super.getName();
    }
}