public static void deleteShortPower(com.sem.btrouble.model.PowerUp power) {
    if (com.sem.btrouble.model.Model.powers.contains(power)) {
        com.sem.btrouble.model.Model.powers.remove(power);
    }
    java.lang.System.out.println("aaah");
}