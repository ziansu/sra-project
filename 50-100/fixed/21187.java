private int handleSwimmerChildGroup(swim.enums.Stil stil, java.lang.String[] lines, int beginIndex, swim.data.swimmer.CSwimmerDataObject dataObject) throws swim.exceptions.ParseException {
    for (int j = beginIndex + 1; j < (lines.length); j++) {
        if (lines[j].contains("}"))
            return j;
        else
            littleParser.handle(dataObject.getStilData().getLaengeDataSet(stil), lines[j]);
        
    }
    throw new swim.exceptions.ParseException("Missing closing brackets.");
}