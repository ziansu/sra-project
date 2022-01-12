public int NumSubMbPart(java.lang.String type) {
    java.lang.System.out.println("implemetation required line 645 NumSubMbPart");
    if (type.equals("P_L0_8x8")) {
        return 1;
    }else
        if (type.equals("P_L0_8x4")) {
            return 2;
        }else
            if (type.equals("P_L0_4x8")) {
                return 2;
            }else
                if (type.equals("P_L0_4x4")) {
                    return 4;
                }
            
        
    
    return 0;
}