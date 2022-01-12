@java.lang.Override
public boolean equals(de.uni_muenster.wi.md2library.model.type.interfaces.Md2Type value) {
    if (!(super.equals(value)))
        return false;
    
    if (!(value instanceof de.uni_muenster.wi.md2library.model.type.implementation.Md2String)) {
        return false;
    }
    de.uni_muenster.wi.md2library.model.type.implementation.Md2String Md2StringValue = ((de.uni_muenster.wi.md2library.model.type.implementation.Md2String) (value));
    return this.getPlatformValue().equals(Md2StringValue.getPlatformValue());
}