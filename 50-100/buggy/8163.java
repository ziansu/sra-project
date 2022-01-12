@java.lang.Override
public zildo.fwk.script.context.LocaleVarContext clone() {
    try {
        if ((locales.size()) > 0) {
            zildo.fwk.script.context.LocaleVarContext cloned = ((zildo.fwk.script.context.LocaleVarContext) (super.clone()));
            cloned.involvedVariables.clear();
            cloned.cloneLocales(this);
            return cloned;
        }else {
            return this;
        }
    } catch (java.lang.CloneNotSupportedException e) {
        throw new java.lang.RuntimeException("Unable to clone this context !");
    }
}