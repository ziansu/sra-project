public void addInfos(java.lang.String msg) {
    redis.InfosWorker.log("Got message: %s", msg);
    com.google.gson.Gson gson = new com.google.gson.Gson();
    graph.Graph.InfosJSON infosJSON = gson.fromJson(msg, graph.Graph.InfosJSON.class);
    graph.Graph graph = new graph.Graph();
    graph.addInfos(infosJSON.getContent());
}