public void inlet(float f) {
    int inletIdx;
    inletIdx = getInlet();
    if (inletIdx == 1) {
        fTorsoZAxis = f;
    }else
        if (inletIdx == 2) {
            fLeftHandYAxis = f;
        }else
            if (inletIdx == 3) {
                fRightHandXAxis = f;
            }
        
    
    java.lang.System.out.println((("I am receiving data from  " + inletIdx) + "th inlet"));
}