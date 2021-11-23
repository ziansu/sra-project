public void run() {
    com.bmc.justdoit.smartkanban.api.objects.KanbanDecoderRequest request = ((com.bmc.justdoit.smartkanban.api.objects.KanbanDecoderRequest) (KanbanQueue.DECODER_QUEUE.poll()));
    if (request != null) {
        java.lang.System.out.println("Got a request to process Kanban.");
        java.lang.System.out.println(("Request Id: " + (request.getRequestId())));
        com.bmc.justdoit.smartkanban.kanban.decoder.KanbanDecoder kanbanDecoder = new com.bmc.justdoit.smartkanban.kanban.decoder.KanbanDecoder(request);
        java.lang.Thread th = new java.lang.Thread(kanbanDecoder);
        th.start();
    }
}