@java.lang.Override
public org.logicng.formulas.Formula nnf() {
    org.logicng.formulas.Formula nnf = this.transformationCache.get(org.logicng.formulas.cache.TransformationCacheEntry.NNF);
    if (nnf == null) {
        if ((this.encoding) == null)
            this.encode();
        
        nnf = this.f.and(this.encoding.formula(this.f));
        this.setTransformationCacheEntry(org.logicng.formulas.cache.TransformationCacheEntry.NNF, nnf);
    }
    return nnf;
}