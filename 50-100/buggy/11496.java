public static java.lang.reflect.Field getFiledNameByMethod(java.lang.Class clazz, java.lang.reflect.Method method) {
    java.lang.reflect.Field[] fields = clazz.getDeclaredFields();
    java.lang.reflect.Field field = null;
    for (java.lang.reflect.Field f : fields)
        if ((f.getAnnotation(indi.yume.tools.autosharedpref.Ignore.class)) == null)
            if (indi.yume.tools.autosharedpref.util.ReflectUtil.toSetter(f.getName()).equals(method.getName()))
                field = f;
            
        
    
    return field;
}