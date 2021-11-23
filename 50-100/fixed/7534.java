private java.lang.Boolean validatePartB(java.lang.Boolean error, java.lang.Double partB, java.lang.Integer totalPartCount, java.lang.Integer partBMax, org.ums.services.academic.CourseRegType regType) {
    if ((totalPartCount == 2) && (partB > partBMax)) {
        error = java.lang.Boolean.TRUE;
    }
    if ((totalPartCount == 1) && ((partB != null) && (partB > 0))) {
        error = java.lang.Boolean.TRUE;
    }
    return error;
}