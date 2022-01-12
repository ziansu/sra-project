public void start() {
    monster.model.MarshmalloMonster basic = new monster.model.MarshmalloMonster();
    java.lang.System.out.println(basic);
    monster.model.MarshmalloMonster guillermo = new monster.model.MarshmalloMonster("Guillermo", 4, 4, 2.1, true);
    java.lang.System.out.println(guillermo);
    java.lang.System.out.println("I am feeling hungry, I am going to eat one of Guillermo's arms.");
    guillermo.setArmCount(((guillermo.getArmCount()) - 1));
    java.lang.System.out.println(guillermo);
    interactWithMonster(guillermo);
    armEat(guillermo);
}