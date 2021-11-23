public void setTime(java.lang.Object t) {
    java.lang.Number num;
    if (t instanceof java.lang.String) {
        num = java.lang.Integer.parseInt(((java.lang.String) (t)));
    }else {
        num = ((java.lang.Number) (t));
    }
    time = num.intValue();
}