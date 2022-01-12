@java.lang.Override
public java.lang.String getAssignmentLHS(org.geogebra.common.kernel.StringTemplate tpl) {
    sbToString.setLength(0);
    sbToString.append(tpl.printVariableName(label));
    if ((this.getLabelDelimiter()) != ':') {
        tpl.appendWithBrackets(org.geogebra.common.kernel.geos.GeoFunction.sb, getVarString(tpl));
    }
    return sbToString.toString();
}