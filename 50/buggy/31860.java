public void add(com.tek.interview.question.OrderLine o) throws java.lang.Exception {
    if (o == null) {
        java.lang.System.err.println("ERROR - Order is NULL");
        throw new java.lang.IllegalArgumentException("Order is NULL");
    }
    orderLines.add(o);
}