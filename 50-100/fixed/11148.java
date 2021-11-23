private int element_manhattan(int i, int j, int index) {
    int ori_i = (index - 1) / (dimension());
    int ori_j = (index - (ori_i * (dimension()))) - 1;
    int idistance = java.lang.Math.abs((i - ori_i));
    int jdistance = java.lang.Math.abs((j - ori_j));
    return idistance + jdistance;
}