public static uk.ac.tgac.conan.process.rnaasm.TrinityV2.Args.SSLibType fromStrandedness(uk.ac.tgac.conan.core.data.Library.Strandedness strandedness) {
    if ((strandedness == (Library.Strandedness.FF_UNSTRANDED)) || (strandedness == (Library.Strandedness.FR_UNSTRANDED))) {
        return null;
    }else
        if (strandedness == (Library.Strandedness.FR_FIRST_STRAND)) {
            return uk.ac.tgac.conan.process.rnaasm.TrinityV2.Args.SSLibType.RF;
        }else
            if (strandedness == (Library.Strandedness.FR_SECOND_STRAND)) {
                return uk.ac.tgac.conan.process.rnaasm.TrinityV2.Args.SSLibType.FR;
            }else {
                throw new java.lang.UnsupportedOperationException("Not sure how to translate this type of strandeded RNAseq library into format suitable for Trinity");
            }
        
    
}