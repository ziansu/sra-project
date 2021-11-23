public static short getQuotient(java.lang.Object obj) {
    java.lang.Integer hashcode = obj.hashCode();
    hashcode = hashcode >> 16;
    hashcode = java.lang.Math.abs(hashcode);
    return hashcode.shortValue();
}