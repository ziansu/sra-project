@java.lang.Override
public <T> T manufacturePojo(java.lang.Class<T> pojoClass, java.lang.reflect.Type... genericTypeArgs) {
    uk.co.jemos.podam.common.ManufacturingContext manufacturingCtx = new uk.co.jemos.podam.common.ManufacturingContext();
    manufacturingCtx.getPojos().put(pojoClass, 1);
    return doManufacturePojo(pojoClass, manufacturingCtx, genericTypeArgs);
}