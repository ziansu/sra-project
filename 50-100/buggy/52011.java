public java.util.List<java.lang.Double> getRes() {
    java.util.List<java.lang.Double> result = null;
    try {
        result = new java.util.ArrayList<java.lang.Double>(res.size());
        java.util.Collections.copy(result, res);
        return result;
    } catch (java.lang.NullPointerException e) {
        java.lang.System.out.println("the list of result is null!");
        e.printStackTrace();
        return result;
    }
}