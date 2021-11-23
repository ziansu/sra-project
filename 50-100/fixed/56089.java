@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o) {
        return true;
    }
    if ((o == null) || ((getClass()) != (o.getClass()))) {
        return false;
    }
    org.axonframework.saga.annotation.SagaMethodMessageHandler that = ((org.axonframework.saga.annotation.SagaMethodMessageHandler) (o));
    return (this.compareTo(that)) == 0;
}