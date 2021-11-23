public void unset() {
    org.slf4j.MDC.remove(ru.trylogic.spring.boot.thrift.beans.RequestIdLogger.getMDCKey());
}