public static int getVetoLayer(int veto) {
    if ((veto > 0) && (veto <= (infn.bed.geometry.GeometricConstants.VETOES))) {
        if (veto <= (infn.bed.geometry.GeometricConstants.CRYSTALS)) {
            return 1;
        }else
            if (veto <= ((infn.bed.geometry.GeometricConstants.INTERNAL_VETOES) + 1)) {
                return 2;
            }else
                if (veto <= (infn.bed.geometry.GeometricConstants.VETOES)) {
                    return 3;
                }
            
        
    }
    return -1;
}