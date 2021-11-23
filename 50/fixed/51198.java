@java.lang.Override
public <RT> RT uniqueResult(com.querydsl.core.types.Expression<RT> expr) {
    com.mysema.commons.lang.CloseableIterator<RT> iterator = iterate(expr);
    return super.uniqueResult(iterator);
}