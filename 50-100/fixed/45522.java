public void indexAdjust(int index) {
    if ((((size) - 1) < index) || (index < (-1))) {
        s.sop("parameter is invalid!");
        return ;
    }
    if (index == (-1))
        return ;
    
    int i = 0;
    current = head.next;
    while ((i < index) && ((current) != null)) {
        current = current.next;
        i++;
    } 
}