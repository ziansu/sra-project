public void execute(org.quartz.JobExecutionContext context) throws org.quartz.JobExecutionException {
    org.quartz.JobKey jobKey = context.getJobDetail().getKey();
    com.dreamycity.lottery.job.LotteryJob.logger.info(jobKey);
    org.springframework.context.ApplicationContext appContext = new org.springframework.context.support.ClassPathXmlApplicationContext("Spring-Module.xml");
    com.dreamycity.lottery.dao.LotteryDAO lotteryDAO = ((com.dreamycity.lottery.dao.LotteryDAO) (appContext.getBean("lotteryDAO")));
    com.dreamycity.lottery.repository.LotteryRepository lotteryRepository = ((com.dreamycity.lottery.repository.LotteryRepository) (appContext.getBean("lotteryRepository")));
    com.dreamycity.lottery.model.Lottery lottery = lotteryRepository.getLottery();
    lotteryDAO.insert(lottery);
}