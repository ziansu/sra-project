public void change(controller.player.Resource give, controller.player.Resource get) {
    java.lang.System.out.println("Hello from change");
    try {
        if ((this.getResourceAmount(give)) >= (changeLUT.get(give)))
            this.decResourceAmount(give, changeLUT.get(give));
        
    } catch (controller.player.OutOfRangeException e) {
        e.printStackTrace();
    }
    try {
        this.incResourceAmount(get, 1);
    } catch (controller.player.OutOfRangeException e) {
        e.printStackTrace();
    }
}