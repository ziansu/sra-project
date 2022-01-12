public void run() {
    while (true) {
        com.bmc.justdoit.smartkanban.api.objects.KanbanGeneratorRequest request = ((com.bmc.justdoit.smartkanban.api.objects.KanbanGeneratorRequest) (KanbanQueue.CREATOR_QUEUE.poll()));
        if (request == null) {
            continue;
        }
        java.lang.System.out.println(("Got a request to create >>>>>>>> " + request));
        com.bmc.justdoit.smartkanban.kanban.creator.KanbanCreator kanbanCreator = new com.bmc.justdoit.smartkanban.kanban.creator.KanbanCreator(request);
        java.lang.Thread th = new java.lang.Thread(kanbanCreator);
        th.start();
    } 
}