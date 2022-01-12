public void toDoDraw(int times, Player person) {
    person.setHand(ClassicUno._deck.remove(0));
    times++;
    java.lang.System.out.println(person);
}