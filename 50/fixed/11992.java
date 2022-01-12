public void setRef(com.brashmonkey.spriter.file.Reference ref) {
    if (ref == null)
        return ;
    
    this.ref = ref;
    this.rect.set(ref.dimensions);
}