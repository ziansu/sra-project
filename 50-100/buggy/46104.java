@java.lang.Override
public lab.mars.m2m.m2msmartofficephone.model.Result<java.lang.String> apply(@io.reactivex.annotations.NonNull
lab.mars.m2m.m2msmartofficephone.model.m2m.PrimitiveContentType primitiveContentType) throws java.lang.Exception {
    for (lab.mars.m2m.m2msmartofficephone.model.m2m.m2m_childResourceRef child : primitiveContentType.cnt.ch) {
        if ((child.ty) == (m2m_ResourceType.CONTAINER.getTy()))
            return new lab.mars.m2m.m2msmartofficephone.model.Result<java.lang.String>(false, "已经存在主管，无法注册!");
        
    }
    return new lab.mars.m2m.m2msmartofficephone.model.Result<java.lang.String>(true, null);
}