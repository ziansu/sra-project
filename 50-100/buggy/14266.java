public static void main(java.lang.String[] args) {
    com.hongliangjie.fugue.MainEntrance.LOGGER.info("Start Application");
    com.hongliangjie.fugue.Options options = com.hongliangjie.fugue.MainEntrance.createOptions();
    com.hongliangjie.fugue.Message cmd = com.hongliangjie.fugue.MainEntrance.parseOptions(options, args);
    if ("NULL".equals(cmd.getParam("task"))) {
        com.hongliangjie.fugue.MainEntrance.LOGGER.info("Failed.");
    }else {
        com.hongliangjie.fugue.topicmodeling.TopicModelDriver m = new com.hongliangjie.fugue.topicmodeling.TopicModelDriver(cmd);
        m.performTask();
    }
    com.hongliangjie.fugue.MainEntrance.LOGGER.info("Complete Application");
}