@java.lang.Override
public void help(w094j.ctrl8.statement.CommandType command) {
    w094j.ctrl8.pojo.Response res = new w094j.ctrl8.pojo.Response();
    if (command == null) {
        res.command = w094j.ctrl8.statement.CommandType.HELP;
    }else {
        res.command = command;
    }
    this.display.updateUI(res);
}