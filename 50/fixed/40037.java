public static cx2x.xcodeml.xelement.Xscope fromString(java.lang.String value) {
    if (value == null) {
        return null;
    }
    switch (value) {
        case XelementName.SCOPE_LOCAL :
            return cx2x.xcodeml.xelement.Xscope.LOCAL;
        case XelementName.SCOPE_GLOBAL :
            return cx2x.xcodeml.xelement.Xscope.GLOBAL;
        case XelementName.SCOPE_PARAM :
            return cx2x.xcodeml.xelement.Xscope.PARAM;
    }
    return null;
}