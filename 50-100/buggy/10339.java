public int compare(java.lang.Object element1, java.lang.Object element2) {
    Brush.VerifyOverlap.VerifyOverlapReducer.OverlapInfo obj1 = ((Brush.VerifyOverlap.VerifyOverlapReducer.OverlapInfo) (element1));
    Brush.VerifyOverlap.VerifyOverlapReducer.OverlapInfo obj2 = ((Brush.VerifyOverlap.VerifyOverlapReducer.OverlapInfo) (element2));
    if (((int) ((obj1.overlap_size) - (obj2.overlap_size))) == 0) {
        return 0;
    }else
        if (((int) ((obj1.overlap_size) - (obj2.overlap_size))) >= 0) {
            return -1;
        }else {
            return 1;
        }
    
}