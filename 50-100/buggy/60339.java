public boolean verifyPreorder(int[] preorder) {
    if (preorder == null) {
        throw new java.lang.IllegalArgumentException("");
    }
    if ((preorder.length) == 0) {
        return true;
    }
    return verifyPreorderRecurse(preorder, 0, ((preorder.length) - 1));
}