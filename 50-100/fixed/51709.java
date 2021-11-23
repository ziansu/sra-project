@java.lang.Override
public int accept(ch.unibe.scg.dicto.Context context, int offset) {
    int length = 0;
    int result = FAILURE;
    while (((context.size()) > length) && ((result = baseAcceptor.accept(context, (offset + length))) != (FAILURE)))
        length += result;
    
    return length;
}