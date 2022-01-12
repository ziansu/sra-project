public java.util.Date[] getDate(java.lang.Integer index) {
    if (index > ((getDates().size()) - 1)) {
        return new java.util.Date[]{  };
    }
    return dateList.get(index);
}