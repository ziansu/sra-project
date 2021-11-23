public void add(E element) {
    if (!(isEmpty())) {
        mList.add(((mCursor) + 1), element);
    }else
        mList.add(0, element);
    
}