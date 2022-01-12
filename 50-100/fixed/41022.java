public double getMax() {
    java.util.ArrayList<java.lang.Double> list = new java.util.ArrayList<java.lang.Double>();
    for (java.lang.Double grade : studentGrades.values()) {
        if (grade != null) {
            list.add(grade);
        }
    }
    java.util.Collections.sort(list);
    if ((list.size()) > 0) {
        return list.get(((list.size()) - 1));
    }else {
        return -1;
    }
}