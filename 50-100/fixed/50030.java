@java.lang.Override
public cw3.ReturnObject get(int index) {
    if ((index < 0) || (index >= (this.size()))) {
        return new cw3.ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
    }else {
        cw3.LinkedList tempList = this;
        for (int i = 0; i <= index; i++) {
            if ((tempList.Listdata) == null) {
                i--;
            }
            if (i < index) {
                tempList = pointer;
            }
        }
        return new cw3.ReturnObjectImpl(tempList.Listdata);
    }
}