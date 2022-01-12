@java.lang.Override
public lab.mars.m2m.m2msmartofficephone.model.Result<java.lang.Boolean> apply(@io.reactivex.annotations.NonNull
retrofit2.Response<lab.mars.m2m.m2msmartofficephone.model.m2m.PrimitiveContentType> admin, @io.reactivex.annotations.NonNull
retrofit2.Response<lab.mars.m2m.m2msmartofficephone.model.m2m.PrimitiveContentType> guest) throws java.lang.Exception {
    if ((admin.code()) == (HttpCodeType.OK.getType()))
        return new lab.mars.m2m.m2msmartofficephone.model.Result<java.lang.Boolean>(true, true);
    
    if ((guest.code()) == (HttpCodeType.OK.getType()))
        return new lab.mars.m2m.m2msmartofficephone.model.Result<java.lang.Boolean>(true, false);
    
    return new lab.mars.m2m.m2msmartofficephone.model.Result<java.lang.Boolean>(false, null);
}