@java.lang.Override
public java.lang.String toString() {
    java.lang.StringBuilder build = new java.lang.StringBuilder("[");
    for (int i = 0; i < (sizeInBytes); i += 8) {
        build.append(java.lang.Long.toHexString(org.apache.spark.unsafe.Platform.getLong(baseObject, ((baseOffset) + i))));
        build.append(',');
    }
    build.append(']');
    return build.toString();
}