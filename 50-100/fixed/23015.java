@java.lang.Override
public java.lang.Boolean saveMessage(com.gescc.hedwig.vo.Message message) {
    try {
        messageList.add(message);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return false;
    }
    try {
        this.saveFile();
    } catch (java.lang.Throwable e) {
        e.printStackTrace();
    }
    return true;
}