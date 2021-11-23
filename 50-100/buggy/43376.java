private void attachMeasureAnswer(gov.va.escreening.service.Measure measure) {
    if ((MeasureTypeEnum.FREETEXT.getMeasureTypeId()) == (measure.getMeasureType().getMeasureTypeId())) {
        gov.va.escreening.service.MeasureAnswer ma = new gov.va.escreening.service.MeasureAnswer();
        ma.setMeasure(measure);
        ma.setDisplayOrder(0);
        ma.setExportName(measure.getVariableName());
        java.util.List<gov.va.escreening.service.MeasureAnswer> maList = new java.util.ArrayList<gov.va.escreening.service.MeasureAnswer>();
        maList.add(ma);
        measure.setMeasureAnswerList(maList);
    }
}