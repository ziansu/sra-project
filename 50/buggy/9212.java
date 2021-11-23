@java.lang.Override
public void handle(java.util.Map data) {
    returnVip();
    dbf.remove(self);
    completion.success();
}