@java.lang.Override
public <T, U> biz.fstechnology.micro.common.Result<U> call(biz.fstechnology.micro.common.Request<T> request) {
    try {
        return call(getDefaultDestination(), request);
    } catch (javax.jms.JMSException e) {
        e.printStackTrace();
        return new biz.fstechnology.micro.common.Result(e);
    }
}