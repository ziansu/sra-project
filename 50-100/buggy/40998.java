private static void printTopRelatedCategories(java.util.List<com.marceljm.entity.Category> categoryList) {
    for (int i = (categoryList.size()) - 1; i > ((categoryList.size()) - 4); i--) {
        java.lang.System.out.println((((java.lang.String.format("%.2f", categoryList.get(i).getValue())) + ":\t") + (categoryList.get(i).getName())));
    }
}