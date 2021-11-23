@java.lang.Override
public void run() {
    command.app.OpenFileCommand command = new command.app.OpenFileCommand();
    if (ev.getFile().isFile()) {
        command.run(ev.getFile());
    }else
        if (ev.getFile().isDirectory()) {
            command.chooseAndOpenFile(ev.getFile());
        }
    
}