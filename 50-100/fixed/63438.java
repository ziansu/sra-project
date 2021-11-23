private core.parse.ParsedBillItem parseItem(java.lang.String billLine) {
    core.parse.ParsedBillItem parsedBillItem = null;
    billLine = clearInhumanCharacters(billLine);
    java.lang.String[] billParts = billLine.split("\\s+");
    core.parse.BillTextParser.NameExtracted nameExtracted = extractName(billParts);
    java.lang.String[] partsWithoutName = nameExtracted.getPartsWithoutName();
    if ((partsWithoutName != null) && ((partsWithoutName.length) > 0)) {
        parsedBillItem = new core.parse.ParsedBillItem();
        parsedBillItem.setName(nameExtracted.getName());
        findAndSetNumericalValues(parsedBillItem, partsWithoutName);
    }
    return parsedBillItem;
}