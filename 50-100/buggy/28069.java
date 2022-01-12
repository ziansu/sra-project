public static int getFirstPageElement(int pageNumber, int pageSize, int totalElements) throws es.udc.rs.app.exceptions.FirstPageElementException {
    int firstElement = 0;
    firstElement = (pageNumber - 1) * pageSize;
    if (firstElement >= totalElements) {
        java.lang.String msg = ((("For this page, the first element would be " + firstElement) + " and the total are ") + totalElements) + " elements";
        throw new es.udc.rs.app.exceptions.FirstPageElementException(msg);
    }
    return firstElement;
}