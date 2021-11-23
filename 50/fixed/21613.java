@java.lang.Override
public void acknowledged(long seqNo) {
    if (seqNo == (base))
        (base)++;
    
}