public java.lang.String getDateAsFormatedString() {
    return ((((days.getSelectedString()) + "/") + (java.lang.Integer.toString(((indexes.indexOf(months.getSelectedString())) + 1)))) + "/") + (years.getSelectedString());
}