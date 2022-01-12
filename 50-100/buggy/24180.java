public java.lang.Object[] toArray() {
    java.lang.Object[] array = new java.lang.Object[realLength];
    for (int i = begin; i < (realLength); i++) {
        array[(i - (begin))] = values[i].toJava(java.lang.Object.class);
    }
    return array;
}