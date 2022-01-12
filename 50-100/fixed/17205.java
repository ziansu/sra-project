public static void init() {
    scondor.Engine.client = new scondor.server.Client();
    scondor.util.Window.init();
    scondor.render.RenderMaster.init();
    scondor.util.Utils.init();
    scondor.inputs.KeyBoard.init();
    scondor.inputs.Mouse.init();
    scondor.Engine.connection = new scondor.content.Connection();
}