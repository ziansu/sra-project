private static java.util.List<com.brianstempin.vindiniumclient.bot.simple.CHEBot.Vertex> getPath(com.brianstempin.vindiniumclient.bot.simple.CHEBot.Vertex target) {
    java.util.List<com.brianstempin.vindiniumclient.bot.simple.CHEBot.Vertex> path = new java.util.LinkedList<com.brianstempin.vindiniumclient.bot.simple.CHEBot.Vertex>();
    path.add(target);
    com.brianstempin.vindiniumclient.bot.simple.CHEBot.Vertex next = target;
    while (((next.getPrevious()) != null) && ((next.getPrevious().getMinDistance()) != 0)) {
        path.add(next.getPrevious());
        next = next.getPrevious();
    } 
    java.util.Collections.reverse(path);
    return path;
}