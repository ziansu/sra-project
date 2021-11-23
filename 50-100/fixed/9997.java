public void parseRobotoReply(java.lang.String resp) {
    java.lang.String cmd = resp.substring(0, 1);
    if (cmd.equals(MsRobotoLab4.ROBOTO_SIMPLE_REPLY)) {
        message = "Success - command done";
    }else
        if (cmd.equals(MsRobotoLab4.ROBOTO_RESULT_REPLY)) {
            message = "Success - ";
            result = java.lang.Integer.parseInt(resp.split(" ")[1]);
        }else {
            message = "Error - ";
            message += resp;
        }
    
}