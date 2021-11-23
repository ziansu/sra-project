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
    } catch (com.fasterxml.jackson.core.JsonGenerationException e) {
        e.printStackTrace();
    } catch (com.fasterxml.jackson.databind.JsonMappingException e) {
        e.printStackTrace();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return true;
}