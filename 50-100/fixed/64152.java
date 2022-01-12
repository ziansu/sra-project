private ReturnObject checkIndex(int index) {
    if (index < 0) {
        return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
    }else
        if (index > (this.size)) {
            return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
        }else {
            return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
        }
    
}