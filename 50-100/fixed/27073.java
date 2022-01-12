private java.util.List makeCategory3List(java.util.List list, int stop) {
    java.util.List<java.lang.Object> tempHint = new java.util.ArrayList<>();
    for (int j = 10; j < ((list.size()) - 10); j++) {
        if (j >= stop)
            try {
                tempHint.add(j, list.get(j));
            } catch (java.lang.IndexOutOfBoundsException e) {
                break;
            }
        
    }
    return tempHint;
}