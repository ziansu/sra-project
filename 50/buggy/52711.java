public void kill() {
    duck1.delete();
    duck2.delete();
    duck3.delete();
    dead = true;
    java.lang.System.out.println("I am dead");
}