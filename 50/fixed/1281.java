@java.lang.Override
public void run() {
    consumer.done(com.alibaba.fastjson.JSON.parseObject(data, com.seveniu.node.Node.class));
    try {
        java.util.concurrent.TimeUnit.SECONDS.sleep(1);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}