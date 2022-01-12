@java.lang.Override
public zildo.fwk.script.context.LocaleVarContext clone() {
    try {
        if ((locales.size()) > 0) {
            zildo.fwk.script.context.LocaleVarContext cloned = ((zildo.fwk.script.context.LocaleVarContext) (super.clone()));
            cloned.involvedVariables = new java.util.HashSet<java.lang.String>();
            cloned.cloneLocales(this);
            return cloned;
        }else {
            return this;
        }
    } catch (java.lang.CloneNotSupportedException e) {
        throw new java.lang.RuntimeException("Unable to clone this context !");
    }
}