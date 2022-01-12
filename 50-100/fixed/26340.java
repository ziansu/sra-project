public static void createNewWorker(java.net.Socket socket) throws java.io.IOException, java.lang.InterruptedException {
    synchronized(br.ufg.inf.handlers.WorkerHandler.class) {
        br.ufg.inf.handlers.entities.Worker worker = new br.ufg.inf.handlers.entities.Worker();
        br.ufg.inf.handlers.WorkerHandler.ProjectSender projectSender = new br.ufg.inf.handlers.WorkerHandler.ProjectSender(worker, socket, br.ufg.inf.handlers.WorkerHandler.projectName, br.ufg.inf.handlers.WorkerHandler.project);
        projectSender.start();
    }
}