protected void die() {
    java.lang.System.out.println("dying");
    super.die();
    if (!(Active))
        Play.GameOver();
    
}