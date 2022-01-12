public static void managerGuard() {
    if (leibniz.hu.forumspider.ThreadManager.isManagerDie()) {
        system.out.println("------------------------>ThreadManager挂掉了，重新启动一个....");
        new java.lang.Thread(new leibniz.hu.forumspider.ThreadManager(), ("manager-" + (new java.util.Random().nextInt()))).start();
    }
}