@java.lang.Override
public int accept(ch.unibe.scg.dicto.Context context, int offset) {
    int length = 0;
    int result = FAILURE;
    while (((context.size()) > 0) && ((result = baseAcceptor.accept(context, length)) != (FAILURE)))
        length += result;
    
    return length;
}