@java.lang.Override
public java.util.Map<java.lang.String, java.lang.Object> initBo(java.lang.String namespace, java.lang.String name) throws com.huoyun.exception.BusinessException {
    this.getBoMeta(namespace, name);
    com.huoyun.core.bo.metadata.BoMeta boMeta = this.getBoMeta(namespace, name);
    com.huoyun.core.bo.BusinessObject bo = this.boFacade.newBo(namespace, name);
    return this.boMapper.converterTo(bo, boMeta);
}