public int nextGreaterElement(int n) {
    char[] a = ("" + n).toCharArray();
    if (!(nextPermutation(a)))
        return -1;
    
    long tmp = 0;
    for (char ch : a)
        tmp = ((tmp * 10) + ch) - '0';
    
    return tmp <= (java.lang.Integer.MAX_VALUE) ? ((int) (tmp)) : -1;
}