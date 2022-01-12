public void indexAdjust(int index) {
    if (((size) < index) || (index < 0)) {
        s.sop("parameter is invalid!");
        return ;
    }
    int i = 0;
    current = head.next;
    while ((i < index) && ((current) != null)) {
        current = current.next;
        i++;
    } 
}