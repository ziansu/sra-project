@java.lang.Override
public java.lang.String executeCommand(java.util.Map<java.lang.String, java.lang.String> request) {
    inc.util.Commands commander = new inc.util.Commands();
    inc.util.Commands.setDone(true);
    if (request.get("result").equals("0")) {
        commander.setResult(request.get("resultstring"));
    }
    return "result";
}