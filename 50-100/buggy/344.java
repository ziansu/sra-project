public java.util.List<java.lang.Integer> getTargetWords() {
    java.util.List<java.lang.Integer> res = new java.util.ArrayList<java.lang.Integer>();
    for (int targetElement : target) {
        if (targetElement > 0) {
            res.add(targetElement);
        }
    }
    return res;
}