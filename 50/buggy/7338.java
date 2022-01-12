public void shoot() {
    sound.play();
    sound = new org.academiadecodigo.bootcamp8.duckhunt.Sound.Sound("/resources/sounds/1.wav");
    java.lang.System.out.println("Sound plays");
    (bullets)--;
}