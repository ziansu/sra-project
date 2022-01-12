@java.lang.Override
protected io.gd.generator.meta.mybatis.mapper.MybatisMapperMeta merge(io.gd.generator.meta.mybatis.mapper.MybatisMapperMeta parsed, io.gd.generator.meta.mybatis.mapper.MybatisMapperMeta read, io.gd.generator.context.MybatisContext context) throws java.lang.Exception {
    if (read != null) {
        parsed.setOtherMethods(read.getOtherMethods());
    }
    return parsed;
}