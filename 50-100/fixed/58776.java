private java.util.List makeCategory4List(java.util.List list) {
    java.util.List<java.lang.Object> tempHint = new java.util.ArrayList<>();
    for (int j = 15; j < ((list.size()) - 15); j++) {
        try {
            tempHint.add(j, list.get(j));
        } catch (java.lang.IndexOutOfBoundsException e) {
            break;
        }
    }
    return tempHint;
}