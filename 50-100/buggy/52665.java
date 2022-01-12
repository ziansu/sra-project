public void buyShips() throws com.ibm.able.AbleException {
    space.Spaceship ship1 = new space.Spaceship("Stateczek", 100);
    space.Spaceship ship2 = new space.Spaceship("Drugi", 60);
    space.Spaceship ship3 = new space.Spaceship("Trzeci", 70);
    fleet.addElement(ship1);
    fleet.addElement(ship2);
    fleet.addElement(ship3);
}