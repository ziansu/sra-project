public static me.dblab.common.values.Type typeFromString(java.lang.String type) throws java.lang.ClassNotFoundException, java.lang.IllegalAccessException, java.lang.InstantiationException, me.dblab.exceptions.InvalidTypeException {
    if (me.dblab.common.values.Type.ExistingTypes().containsKey(type)) {
        java.lang.System.out.println(me.dblab.common.values.Type.ExistingTypes().get(type));
        java.lang.Class cls = java.lang.Class.forName(me.dblab.common.values.Type.ExistingTypes().get(type));
        return ((me.dblab.common.values.Type) (cls.newInstance()));
    }else {
        throw new me.dblab.exceptions.InvalidTypeException();
    }
}