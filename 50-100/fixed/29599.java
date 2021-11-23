public static void main(java.lang.String[] args) {
    java.lang.Thread thread1 = new java.lang.Thread() {
        public void run() {
            com.opentransport.rdfmapper.nmbs.Main.scrapeLiveBoards();
        }
    };
    java.lang.Thread thread2 = new java.lang.Thread() {
        public void run() {
            com.opentransport.rdfmapper.nmbs.NetworkDisturbanceFetcher ndf = new com.opentransport.rdfmapper.nmbs.NetworkDisturbanceFetcher();
        }
    };
    thread1.start();
    thread2.start();
}