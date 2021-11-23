public org.nutz.aop.InterceptorChain doChain() throws java.lang.Throwable {
    if (it.hasNext())
        it.next().filter(this);
    
    return chain.doChain();
}