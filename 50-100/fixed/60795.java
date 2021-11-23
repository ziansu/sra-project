@java.lang.Override
public java.lang.String getAssignmentLHS(org.geogebra.common.kernel.StringTemplate tpl) {
    sbToString.setLength(0);
    sbToString.append(tpl.printVariableName(label));
    if ((this.getLabelDelimiter()) != ':') {
        tpl.appendWithBrackets(sbToString, getVarString(tpl));
    }
    return sbToString.toString();
}