protected void shiftRight(int index) {
    if (isFull())
        throw new java.lang.IllegalStateException("Le tableau est plein");
    else
        if (isEmpty()) {
            return ;
        }else
            if (index > (lastIndex)) {
                return ;
            }else {
                for (int i = lastIndex; i > index; i--) {
                    myList[i] = myList[(i - 1)];
                }
            }
        
    
}