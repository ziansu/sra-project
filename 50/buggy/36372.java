public void set(javax.servlet.http.HttpServletRequest request) {
    org.slf4j.MDC.put(ru.trylogic.spring.boot.thrift.beans.RequestIdLogger.getMDCKey(), getXRequestId(request));
}