public static java.util.Date processedDate(java.lang.Integer year, java.lang.Integer month, java.lang.Integer day, boolean isStart) {
    java.util.Date temp;
    if (isStart)
        temp = new java.util.Date((year - 1900), (month - 1), day, 12, 0, 0);
    else
        temp = new java.util.Date((year - 1900), (month - 1), day, 23, 59, 59);
    
    java.lang.System.out.println(temp);
    return temp;
}