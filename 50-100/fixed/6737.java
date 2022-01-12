public boolean removeOrder(PurchasedItem item) {
    if ((numItems) > 0) {
        for (int i = 0; i < (numItems); i++) {
            if (items[i].equals(item)) {
                for (int j = i + 1; j < (numItems); j++) {
                    items[(j - 1)] = items[j];
                }
                (numItems)--;
                return true;
            }
        }
    }
    return false;
}