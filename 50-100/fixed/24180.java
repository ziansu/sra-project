public java.lang.Object[] toArray() {
    java.lang.Object[] array = new java.lang.Object[realLength];
    for (int i = 0; i < (realLength); i++) {
        array[i] = values[(i + (begin))].toJava(java.lang.Object.class);
    }
    return array;
}