public static void init(java.lang.Object obj) {
    java.lang.Class tClass = obj.getClass();
    while (tClass != (java.lang.Object.class)) {
        for (java.lang.Class iFace : tClass.getInterfaces())
            for (org.jtrfp.trcl.core.FeatureFactory ff : org.jtrfp.trcl.core.Features.getFactoryCollection(iFace))
                org.jtrfp.trcl.core.Features.get(obj, ff.getFeatureClass());
            
        
        tClass = tClass.getSuperclass();
    } 
}