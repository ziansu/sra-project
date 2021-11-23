public double getMin() {
    java.util.ArrayList<java.lang.Double> list = new java.util.ArrayList<java.lang.Double>();
    for (java.lang.Double grade : studentGrades.values()) {
        if (grade != null) {
            list.add(grade);
        }
    }
    java.util.Collections.sort(list);
    if ((list.size()) > 0) {
        return list.get(0);
    }else {
        return -1;
    }
}