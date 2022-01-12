public static void init() {
    scondor.Engine.client = new scondor.server.Client();
    scondor.util.Window.init();
    scondor.render.RenderMaster.init();
    scondor.util.Utils.init();
    scondor.inputs.KeyBoard.init();
    scondor.inputs.Mouse.init();
    scondor.components.ComponentMaster.init();
    scondor.panels.Panels.init();
    scondor.Engine.connection = new scondor.content.Connection();
    scondor.Engine.connection.start();
    java.lang.System.out.println("inited");
}