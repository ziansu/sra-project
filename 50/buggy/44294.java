public java.lang.Integer save(com.litt.saap.system.vo.DictParamVo dictParam) {
    com.litt.saap.system.po.DictParam po = com.litt.core.util.BeanCopier.copy(dictParam, com.litt.saap.system.po.DictParam.class);
    return this.save(dictParam);
}