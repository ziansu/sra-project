public java.util.List<java.lang.String> dayOrder(java.util.List<java.lang.String> daysWeek) {
    java.util.List<java.lang.String> order = new java.util.ArrayList<>();
    for (int i = 0, j = day; i <= 7; i++) {
        order.add(daysWeek.get(j));
        j++;
        if (j == 7)
            j = 0;
        
    }
    return order;
}