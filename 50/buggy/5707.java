public boolean isCold() {
    if (((getColdWorkPermitNo()) != null) || ((getColdWorkPermitNo().getStringCellValue().compareTo("")) == 0)) {
        return false;
    }else {
        return true;
    }
}