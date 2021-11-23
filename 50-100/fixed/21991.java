protected static final <E extends org.sugarj.common.cleardep.PersistableEntity> E tryReadElseCreate(java.lang.Class<E> clazz, org.sugarj.common.cleardep.Stamper stamper, org.sugarj.common.path.Path p) throws java.io.IOException {
    try {
        E e = org.sugarj.common.cleardep.PersistableEntity.read(clazz, stamper, p);
        if (e != null)
            return e;
        
        return org.sugarj.common.cleardep.PersistableEntity.create(clazz, stamper, p);
    } catch (java.io.IOException e) {
        e.printStackTrace();
        return org.sugarj.common.cleardep.PersistableEntity.create(clazz, stamper, p);
    }
}