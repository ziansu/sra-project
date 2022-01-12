@org.springframework.messaging.handler.annotation.MessageMapping(value = "/init")
@org.springframework.messaging.handler.annotation.SendTo(value = "/topic/init")
public hello.ResponseMessage init(java.lang.String value) throws java.lang.Exception {
    java.lang.Thread.sleep(1000);
    java.lang.System.out.println(value);
    java.lang.String fileName = ("����/" + (java.lang.Integer.valueOf(value))) + ".txt";
    java.lang.System.out.println(fileName);
    AI = new cn.edu.cqu.engine.Machine(2, new java.io.File(fileName));
    java.lang.System.out.println(((messageID)++));
    return new hello.ResponseMessage(toJSON(AI.getCurrentChessboard().chessboard));
}