public void incHead() {
    if (rob[0].getType().equals("")) {
        java.lang.System.out.println("ROB is Empty Can NOT increment Head - ROB Class");
        return ;
    }
    if ((head) == ((rob.length) - 1))
        head = 0;
    else
        (head)++;
    
}