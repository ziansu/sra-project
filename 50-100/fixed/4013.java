public controller.SubController getSubControllerFor(java.lang.String action) {
    switch (action) {
        case data.Keys.action_click :
            return this.getClickController();
        case data.Keys.action_doubleClick :
            return this.getDoubleClickController();
        case data.Keys.action_key :
            return this.getKeyController();
        case data.Keys.action_wait :
            return this.getWaitController();
        default :
            util.Log.log("Selected Action doesn't match any pre-defined actions (StartController.getSubController())", Log.Level.FATAL);
            return null;
    }
}