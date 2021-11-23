public boolean removePacketInfo(int input) {
    PacketInfo tempy = head;
    PacketInfo prev = null;
    if (tempy == null) {
        return false;
    }
    while (tempy != null) {
        if ((tempy.seq) == input) {
            if (tempy == (head)) {
                head = head.next;
                (size)--;
                return true;
            }
            prev.next = tempy.next;
            (size)--;
            return true;
        }else {
            prev = tempy;
            tempy = tempy.next;
        }
    } 
    return false;
}