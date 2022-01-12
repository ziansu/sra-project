public void setCurrent(int i) {
    int count = 0;
    Lab3.Node temp = head;
    if (null != temp) {
        while ((null != (temp.getLink())) && (i > (count++)))
            temp = temp.getLink();
        
        cursor = temp;
    }else
        throw new java.lang.IllegalStateException("The list is empty");
    
}