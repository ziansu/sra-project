@java.lang.Override
protected io.beanmapper.testmodel.converterbetweennestedclasses.NestedTargetAbstractClass doConvert(io.beanmapper.testmodel.converterbetweennestedclasses.NestedSourceClass source) {
    io.beanmapper.testmodel.converterbetweennestedclasses.NestedTargetClass target = beanMapper.map(source, io.beanmapper.testmodel.converterbetweennestedclasses.NestedTargetClass.class);
    target.laptopNumber = ("[" + (target.laptopNumber)) + "]";
    return target;
}