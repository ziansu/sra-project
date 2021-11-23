@java.lang.Override
public suneido.database.query.Header header() {
    return new suneido.database.query.Header(source.header(), new suneido.database.query.Header(java.util.Arrays.asList(noFields, real_fields()), flds));
}