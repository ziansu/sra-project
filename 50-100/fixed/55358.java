private static java.util.ArrayList subList(java.util.ArrayList arrayList, int l, int r) {
    java.util.ArrayList newsArrayList = new java.util.ArrayList<>();
    for (int i = l; i < r; ++i)
        newsArrayList.add(arrayList.get(i));
    
    return newsArrayList;
}