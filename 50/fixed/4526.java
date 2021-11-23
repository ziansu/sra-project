@java.lang.Override
public void beginArray(int size, org.neo4j.kernel.api.index.ArrayType arrayType) {
    if (size > 0) {
        builder.append(typeChar(arrayType));
    }
}