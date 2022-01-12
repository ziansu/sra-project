@java.lang.Override
public io.ebean.ext.ExtExpressionList<T> endOr() {
    return new io.ebean.ext.ExtExpressionList<T>(this.query, defaultExpressionList.endOr());
}