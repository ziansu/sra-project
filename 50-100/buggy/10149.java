public void refresh() {
    if (this.status) {
        World.currentWorld.set_Case(this.dest_add, this.to_add);
        java.lang.System.out.println("Refreshing replacing case");
        java.lang.System.out.println(this.to_add);
        this.notifyObserver();
    }else {
        World.currentWorld.set_Case(this.dest_add, this.replaced);
        java.lang.System.out.println("Refreshing normal case");
        java.lang.System.out.println(this.dest_add);
        this.notifyObserver();
    }
}