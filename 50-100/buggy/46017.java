java.lang.String unformattedContents() {
    switch (currentCell.getType()) {
        case "s" :
            if (!(lastContents.isEmpty())) {
                int idx = java.lang.Integer.parseInt(lastContents);
                return new org.apache.poi.xssf.usermodel.XSSFRichTextString(sst.getEntryAt(idx)).toString();
            }
            return lastContents;
        case "inlineStr" :
            return new org.apache.poi.xssf.usermodel.XSSFRichTextString(lastContents).toString();
        default :
            return lastContents;
    }
}