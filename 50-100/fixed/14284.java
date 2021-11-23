@com.sinosoft.one.mvc.web.annotation.rest.Post(value = "makeBoardEdit")
public com.sinosoft.one.mvc.web.instruction.reply.Reply makeBoardEdit(@com.sinosoft.one.mvc.web.annotation.Param(value = "flag")
java.lang.String flag, @com.sinosoft.one.mvc.web.annotation.Param(value = "boardNo")
java.lang.String boardNo, @com.sinosoft.one.mvc.web.annotation.Param(value = "productNoStr")
java.lang.String productNoStr, com.sinosoft.one.mvc.web.Invocation inv) throws java.io.IOException {
    java.lang.String jsonStr = synthesisService.makeBoard(boardNo, flag, productNoStr, inv);
    return com.sinosoft.one.mvc.web.instruction.reply.Replys.with(jsonStr).as(com.sinosoft.one.mvc.web.instruction.reply.transport.Json.class);
}