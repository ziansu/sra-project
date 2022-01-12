public java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> subsetsWithDup(java.util.ArrayList<java.lang.Integer> S) {
    java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> result = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
    java.util.ArrayList<java.lang.Integer> sortedList = new java.util.ArrayList<java.lang.Integer>(S);
    java.util.Collections.sort(sortedList);
    java.util.ArrayList<java.lang.Integer> path = new java.util.ArrayList<java.lang.Integer>();
    subsetHelp(result, path, sortedList, 0);
    return result;
}