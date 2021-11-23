private int[] mapToInt(java.util.List<java.lang.Integer> list) {
    int[] ret = new int[list.size()];
    for (int i = 0; i < (ret.length); i++)
        ret[i] = list.get(i);
    
    return ret;
}