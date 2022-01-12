private java.lang.Class<?> getInterceptorAnnotationType(javax.enterprise.inject.spi.InterceptionType interceptionType) {
    switch (interceptionType) {
        case AROUND_CONSTRUCT :
            return javax.interceptor.AroundConstruct.class;
        case POST_CONSTRUCT :
            return javax.annotation.PostConstruct.class;
        case PRE_DESTROY :
            return javax.annotation.PreDestroy.class;
        case PRE_PASSIVATE :
            return javax.ejb.PrePassivate.class;
        case POST_ACTIVATE :
            return javax.ejb.PostActivate.class;
        case AROUND_INVOKE :
            return javax.interceptor.AroundInvoke.class;
        case AROUND_TIMEOUT :
            return javax.interceptor.AroundTimeout.class;
    }
    throw new java.lang.IllegalArgumentException(("Invalid interception type " + interceptionType));
}