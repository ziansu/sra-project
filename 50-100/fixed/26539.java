@java.lang.Override
public void bitShiftLeft(int count, zorbage.type.data.int128.UnsignedInt128Member a, zorbage.type.data.int128.UnsignedInt128Member b) {
    if (count < 0)
        bitShiftRight(java.lang.Math.abs(count), a, b);
    else
        if (count > 127)
            assign(UnsignedInt128Member.ZERO, b);
        else {
            zorbage.type.data.int128.UnsignedInt128Member tmp = new zorbage.type.data.int128.UnsignedInt128Member(a);
            for (int i = 0; i < count; i++) {
                shiftLeftOneBit(tmp);
            }
            assign(tmp, b);
        }
    
}