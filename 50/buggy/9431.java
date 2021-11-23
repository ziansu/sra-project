@java.lang.Override
@io.vertx.codegen.annotations.Nullable
public java.lang.String subtag(int level) {
    ensureHeaderProcessed();
    if (level < (parsedValues.length)) {
        return parsedValues[level];
    }
    return null;
}