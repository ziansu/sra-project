public static controllers.StateController getController(java.lang.String controllerType) {
    switch (controllerType) {
        case "DFS" :
            return new controllers.DFSController();
        case "UCS" :
            return new controllers.UCSController();
        case "GS" :
            return new controllers.GSController();
        case "A-star" :
            return new controllers.AStarController();
        default :
            return new controllers.BFSController();
    }
}