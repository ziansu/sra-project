private java.lang.Object printIValPrim(jats.utfpl.stfpl.instructions.IValPrim vp) {
    if (vp instanceof jats.utfpl.stfpl.instructions.AtomValue) {
        return printAtomValue(((jats.utfpl.stfpl.instructions.AtomValue) (vp)));
    }else
        if (vp instanceof jats.utfpl.stfpl.instructions.AtomValue) {
            return printSId(((jats.utfpl.stfpl.instructions.SId) (vp)));
        }else
            if (vp instanceof jats.utfpl.stfpl.instructions.SIdUser) {
                return printSIdUser(((jats.utfpl.stfpl.instructions.SIdUser) (vp)));
            }else {
                throw new java.lang.Error((vp + " is not supported"));
            }
        
    
}