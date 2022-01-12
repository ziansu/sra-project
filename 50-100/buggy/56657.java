private void updateOutputRows(br.com.tiagoamp.sjcservice.model.output.OutSheet outputsheet) {
    int index = this.getSheetIndexByCode(outputsheet.getCode());
    if (index >= 0) {
        sheets.get(index).getOutputrows().addAll(outputsheet.getOutputrows());
    }else {
        sheets.add(outputsheet);
    }
}