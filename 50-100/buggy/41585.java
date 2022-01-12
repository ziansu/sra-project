public void createShape(com.bas.map.model.Shape shape) {
    org.apache.ibatis.session.SqlSession session = com.bas.map.util.MyBatisUtil.getSessionFactory().openSession(true);
    try {
        com.bas.map.mapper.ShapeMapper shapeMapper = session.getMapper(com.bas.map.mapper.ShapeMapper.class);
        com.bas.map.mapper.CoordinateMapper coordinateMapper = session.getMapper(com.bas.map.mapper.CoordinateMapper.class);
        coordinateMapper.deleteAllCoordinates();
        shapeMapper.deleteAllShapes();
        shapeMapper.insertShape(shape);
        coordinateMapper.InsertListOfCoordinates(shape.getCoordinates());
    } finally {
        session.close();
    }
}