public void push(org.arcueidarc.nekoarc.types.ArcObject obj) {
    for (; ;) {
        try {
            stack[((sp)++)] = obj;
            return ;
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            (sp)--;
            stackgc();
            if ((sp) >= (stack.length))
                throw new org.arcueidarc.nekoarc.NekoArcException("stack overflow");
            
        }
    }
}