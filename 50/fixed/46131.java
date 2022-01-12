private java.util.List<java.lang.String> translate(java.util.List<java.lang.String> message) {
    java.util.ArrayList<java.lang.String> newLore = new java.util.ArrayList<>();
    for (java.lang.String msg : message)
        newLore.add(translate(msg));
    
    return newLore;
}