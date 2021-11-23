public void incHead() {
    if (rob[head].getType().equals("")) {
        java.lang.System.out.println("ROB is Empty Can NOT increment Head - ROB Class");
        return ;
    }
    if ((head) == ((rob.length) - 1))
        head = 0;
    else
        (head)++;
    
}