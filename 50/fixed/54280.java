public java.util.Date[] getDate(java.lang.Integer index) {
    if (((getDates().size()) - 1) < index) {
        return new java.util.Date[]{  };
    }
    return dateList.get(index);
}