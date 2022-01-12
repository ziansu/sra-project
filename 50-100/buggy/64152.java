private ReturnObject checkIndex(int index) {
    ReturnObject ro;
    if (index < 0) {
        ro = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
    }else
        if (index > (this.size)) {
            ro = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
        }else {
            ro = new ReturnObjectImpl(ErrorMessage.NO_ERROR);
        }
    
    return ro;
}