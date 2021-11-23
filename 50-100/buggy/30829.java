public static java.lang.Integer[] list2Array(java.util.List<java.lang.Integer> datas) {
    java.lang.Integer[] nums = new java.lang.Integer[datas.size()];
    for (int i = 0; i < (datas.size()); i++) {
        nums[i] = datas.get(((int) (i)));
    }
    return nums;
}