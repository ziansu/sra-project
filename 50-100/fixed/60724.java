public static void alphSort(Assignment3.Item newSort, java.util.ArrayList<Assignment3.Item> shoppingCart) {
    int index = 0;
    for (int i = 0; i < (shoppingCart.size()); i++) {
        if ((newSort.name.compareToIgnoreCase(shoppingCart.get(i).name)) > 0) {
            index = i + 1;
        }else {
            shoppingCart.add(i, newSort);
            return ;
        }
    }
    shoppingCart.add(index, newSort);
}