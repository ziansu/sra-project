public boolean deleteByRef(com.googlecode.objectify.Ref<T> ref) {
    if (null == ref)
        return true;
    
    return this.deleteByKey(ref.key());
}