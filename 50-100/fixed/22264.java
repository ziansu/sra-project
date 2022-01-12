public void run() {
    while (true) {
        try {
            getOrder();
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
        java.lang.System.out.println((((("Cook : " + (this.id)) + " now cooking for diner : ") + (this.help_d.id)) + "\n"));
        try {
            prepareFood();
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    } 
}