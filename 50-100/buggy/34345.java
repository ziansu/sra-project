public static soot.Type getMorePreciseType(soot.Type tp1, soot.Type tp2) {
    if (tp1 == null)
        return tp2;
    else
        if (tp2 == null)
            return tp1;
        else
            if (tp1 == tp2)
                return tp1;
            else
                if (soot.jimple.infoflow.util.TypeUtils.isObjectLikeType(tp1))
                    return tp2;
                else
                    if (soot.jimple.infoflow.util.TypeUtils.isObjectLikeType(tp2))
                        return tp1;
                    else
                        if (soot.Scene.v().getFastHierarchy().canStoreType(tp1, tp2))
                            return tp1;
                        else
                            return tp2;
                        
                    
                
            
        
    
}