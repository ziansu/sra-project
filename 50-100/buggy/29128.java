public static void main(java.lang.String[] args) {
    com.kitcenter.runners.homework.lesson16.Tractor wheeledTractor = new com.kitcenter.runners.homework.lesson16.WheeledTractor("Wheeled Tractor", 99);
    com.kitcenter.runners.homework.lesson16.Tractor crawlerTractor = new com.kitcenter.runners.homework.lesson16.CrawlerTractor("Crawled Tractor", 101);
    wheeledTractor.setPassenger(3);
    wheeledTractor.setWeight(1500);
    wheeledTractor.setWheel(4);
    crawlerTractor.setPassenger(4);
    crawlerTractor.setWeight(2000);
    crawlerTractor.setWheel(0);
    java.lang.System.out.println(wheeledTractor.toString());
    java.lang.System.out.println(crawlerTractor.toString());
}