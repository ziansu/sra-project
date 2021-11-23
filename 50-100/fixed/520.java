private int handleCompetitionChildGroup(java.lang.String[] lines, int beginIndex, swim.data.swim.CCompetitionDataObject dataObject) throws swim.exceptions.ParseException {
    swim.data.swim.CCompetitionChildRun childRun = new swim.data.swim.CCompetitionChildRun();
    for (int j = beginIndex + 1; j < (lines.length); j++) {
        if (lines[j].contains("}")) {
            dataObject.getStructure().addChildRun(childRun);
            return j;
        }else
            littleParser.handle(childRun, lines[j]);
        
    }
    throw new swim.exceptions.ParseException("Missing closing brackets.");
}