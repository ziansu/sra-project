@java.lang.Override
public void selected(model.Host host) {
    java.lang.String path = (host.getName().equals("Alessio")) ? "D:\\Musik\\25.08.2015" : "";
    controller.FileListController fileListC = new controller.FileListController();
    fileListC.show(path, host, api);
}