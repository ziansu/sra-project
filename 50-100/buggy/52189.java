public java.util.List<T> asList(int many) {
    if (many <= 0)
        many = 1;
    
    if (many == 1)
        return java.util.Arrays.asList(mock());
    
    java.util.List<T> mocks = new java.util.ArrayList<>();
    for (int i = 0; i < many; i++) {
        mocks.add(mock(i));
    }
    return mocks;
}