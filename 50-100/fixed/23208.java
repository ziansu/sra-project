public org.flasck.flas.hsie.SubstExpr singleExpr(java.util.Set<org.flasck.flas.hsie.SubstExpr> onlyCases) {
    org.flasck.flas.hsie.SubstExpr ret = null;
    for (org.flasck.flas.hsie.SubstExpr e : mapping.values())
        if ((onlyCases != null) && (!(onlyCases.contains(e))))
            continue;
        else
            if (ret != null)
                throw new org.zinutils.exceptions.UtilException("There is more than one remaining expression");
            else
                ret = e;
            
        
    
    return ret;
}