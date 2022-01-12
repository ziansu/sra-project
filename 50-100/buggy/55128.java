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
                return true;
            }
            prev.next = tempy.next;
            return true;
        }else {
            prev = tempy;
            tempy = tempy.next;
        }
    } 
    return false;
}