public void startGame() {
    automatedGame = new java.lang.Thread() {
        @java.lang.Override
        public void run() {
            while (!(super.isInterrupted())) {
                try {
                    java.lang.Thread.sleep(1000);
                } catch (java.lang.InterruptedException e) {
                }
                doNextIterativeStep();
            } 
        }
    };
    automatedGame.start();
}