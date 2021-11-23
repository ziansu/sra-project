protected java.lang.Boolean doInBackground(java.lang.Void... params) {
    java.lang.Boolean result = com.fluffyadventure.controller.Controller.connectToServer(server, port);
    if ((com.fluffyadventure.controller.Controller.getUser()) != null) {
        login = com.fluffyadventure.controller.Controller.login(com.fluffyadventure.controller.Controller.getUser().getName(), com.fluffyadventure.controller.Controller.getUser().getPassword());
    }
    return result;
}