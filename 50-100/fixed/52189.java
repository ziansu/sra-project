public java.util.List<T> asList(int many) {
    int n = many;
    if (n <= 0)
        n = 1;
    
    if (n == 1)
        return java.util.Arrays.asList(mock());
    
    java.util.List<T> mocks = new java.util.ArrayList<>();
    for (int i = 0; i < n; i++) {
        mocks.add(mock(i));
    }
    return mocks;
}