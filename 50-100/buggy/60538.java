public void setTextVerticalOverflow(org.apache.poi.xssf.usermodel.TextVerticalOverflow overflow) {
    org.apache.poi.xssf.usermodel.CTTextBodyProperties bodyPr = ctShape.getTxBody().getBodyPr();
    if (bodyPr != null) {
        if ((anchor) == null) {
            if (bodyPr.isSetVertOverflow())
                bodyPr.unsetVertOverflow();
            
        }else {
            bodyPr.setVertOverflow(STTextVertOverflowType.Enum.forInt(((overflow.ordinal()) + 1)));
        }
    }
}