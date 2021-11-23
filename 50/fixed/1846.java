@org.springframework.scheduling.annotation.Scheduled(fixedRate = 5000)
public void run() {
    executeCleaning();
}