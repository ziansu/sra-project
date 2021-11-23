@java.lang.Override
protected boolean doParseLineItem(uk.ac.ebi.pride.gui.data.mztab.parser.MzTabParser context, java.lang.String line, long lineNumber, long offset) throws uk.ac.ebi.pride.gui.data.mztab.parser.exceptions.LineItemParsingHandlerException {
    java.lang.String[] lineItems = line.split("\t");
    if (((lineItems.length) == 3) && (lineItems[1].equals(uk.ac.ebi.pride.gui.data.mztab.parser.MzTabVersionLineItemParsingHandler.MZTAB_VERSION_KEYWORD))) {
        return doProcessMztabVersion(uk.ac.ebi.pride.gui.data.mztab.parser.MzTabParser, java.lang.String, lineNumber, offset, line[2]);
    }
    return false;
}