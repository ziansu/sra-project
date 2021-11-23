public io.konig.sql.query.SelectExpression selectExpression(io.konig.transform.TransformFrame frame) throws io.konig.transform.ShapeTransformException {
    io.konig.transform.sql.query.SqlFrameFactory factory = new io.konig.transform.sql.query.SqlFrameFactory();
    io.konig.transform.sql.query.SqlFrame s = factory.create(frame);
    io.konig.sql.query.SelectExpression select = new io.konig.sql.query.SelectExpression();
    addFrom(select, s);
    addIdAttribute(s, select);
    for (io.konig.transform.sql.query.SqlAttribute attr : s.getAttributes()) {
        select.add(valueExpression(attr));
    }
    return select;
}