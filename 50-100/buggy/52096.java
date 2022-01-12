public static void main(java.lang.String[] args) {
    divvyhost.DivvyHost.service = new divvyhost.service.Service();
    divvyhost.DivvyHost divvy = new divvyhost.DivvyHost();
    if (!(divvy.checkParameters(java.util.Arrays.asList(args))))
        return ;
    
    if (!(divvy.start()))
        divvyhost.DivvyHost.log.severe("Divvy Start Failed!");
    
}