@java.lang.Override
public cw3.ReturnObject get(int index) {
    if ((index < 0) || (index >= (this.size()))) {
        return new cw3.ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
    }else {
        cw3.LinkedList tempList = pointer;
        for (int i = 1; i == index; i++) {
            tempList = pointer;
        }
        return new cw3.ReturnObjectImpl(tempList.Listdata);
    }
}