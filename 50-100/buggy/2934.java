@java.lang.Override
public <S extends T> java.util.List<S> findAll(org.springframework.data.domain.Example<S> example, org.springframework.data.domain.Sort sort) {
    return db().find(example.getProbeType()).where(org.springframework.data.ebean.convert.ExampleExpressionBuilder.exampleExpression(db(), example)).setOrder(org.springframework.data.ebean.convert.PageListOrderConverter.convertToEbeanOrder(sort)).findList();
}